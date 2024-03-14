package org.example;

public final class NoRestrictionFactory extends MacronutrientFactory
{
    private static NoRestrictionFactory instance;

    private NoRestrictionFactory() {}

    public static NoRestrictionFactory getInstance()
    {
        if (instance == null)
        {
            instance = new NoRestrictionFactory();
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
