package org.example;

public final class MealFactory
{
    private static MealFactory instance;

    private MealFactory()
    {
    }

    public static MealFactory getInstance()
    {
        if (instance == null)
        {
            instance = new MealFactory();
        }

        return instance;
    }

    public MacronutrientFactory getFactory(Customer customer)
    {
        MacronutrientFactory factory;

        switch (customer.getDietPlan())
        {
            default:
            case "No Restriction":
                factory = NoRestrictionFactory.getInstance();
                break;
            case "Paleo":
                factory = PaleoFactory.getInstance();
                break;
            case "Vegan":
                factory = VeganFactory.getInstance();
                break;
            case "Nut Allergy":
                factory = NutAllergyFactory.getInstance();
                break;
        }

        return factory;
    }
}
