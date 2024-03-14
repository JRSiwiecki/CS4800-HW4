package org.example;

public final class PaleoFactory extends MacronutrientFactory
{
    private static PaleoFactory instance;

    private PaleoFactory() {}

    public static PaleoFactory getInstance()
    {
        if (instance == null)
        {
            instance = new PaleoFactory();
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
