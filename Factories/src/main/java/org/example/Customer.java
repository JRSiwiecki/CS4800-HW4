package org.example;

public class Customer
{

    private String name;
    private String dietPlan;
    private Meal meal;

    public Customer(String name, String dietPlan)
    {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDietPlan()
    {
        return dietPlan;
    }

    public void setDietPlan(String dietPlan)
    {
        this.dietPlan = dietPlan;
    }

    public Meal getMeal()
    {
        return meal;
    }

    public void setMeal(Meal meal)
    {
        this.meal = meal;
    }

    @Override
    public String toString()
    {
        return "[" + name + " - " + dietPlan + " " + meal.toString() + "]";
    }
}
