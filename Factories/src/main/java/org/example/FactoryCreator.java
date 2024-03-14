package org.example;

public final class FactoryCreator
{
    private static FactoryCreator instance;

    private FactoryCreator() {}

    public static FactoryCreator getInstance()
    {
        if (instance == null)
        {
            instance = new FactoryCreator();
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
