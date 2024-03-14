package org.example;

public class Meal
{
    private Carb carb;
    private Protein protein;
    private Fat fat;

    public Carb getCarb()
    {
        return carb;
    }

    public void setCarb(Carb carb)
    {
        this.carb = carb;
    }

    public Protein getProtein()
    {
        return protein;
    }

    public void setProtein(Protein protein)
    {
        this.protein = protein;
    }

    public Fat getFat()
    {
        return fat;
    }

    public void setFat(Fat fat)
    {
        this.fat = fat;
    }
}
