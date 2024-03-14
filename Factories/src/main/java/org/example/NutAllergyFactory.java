package org.example;

public final class NutAllergyFactory extends MacronutrientFactory
{
    private static NutAllergyFactory instance;

    private NutAllergyFactory()
    {
    }

    public static NutAllergyFactory getInstance()
    {
        if (instance == null)
        {
            instance = new NutAllergyFactory();
        }

        return instance;
    }

    @Override
    public Meal makeMeal(Customer customer)
    {
        Meal meal = new Meal();

        CarbFactory carbFactory = CarbFactory.getInstance();
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        FatFactory fatFactory = FatFactory.getInstance();

        meal.setCarb(carbFactory.getCarb(customer.getDietPlan()));
        meal.setProtein(proteinFactory.getProtein(customer.getDietPlan()));
        meal.setFat(fatFactory.getFat(customer.getDietPlan()));

        return meal;
    }
}
