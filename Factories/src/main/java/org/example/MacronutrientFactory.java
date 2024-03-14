package org.example;

public class MacronutrientFactory
{
    private static MacronutrientFactory instance;

    private MacronutrientFactory() { }

    public static MacronutrientFactory getInstance()
    {
        if (instance == null)
        {
            instance = new MacronutrientFactory();
        }

        return instance;
    }

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
