package org.example;

public class Pizza
{
    private String chain;
    private String size;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;

    public Pizza(String chain, String size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomatoAndBasil, boolean beef, boolean ham, boolean pesto, boolean spicyPork, boolean hamAndPineapple)
    {
        this.chain = chain;
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoAndBasil = tomatoAndBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamAndPineapple = hamAndPineapple;
    }

    public void eat()
    {
        System.out.println(this.chain);
        System.out.println(this.size + " pizza with " + getNumberOfToppings() + " toppings ");
        System.out.println("toppings: " + getToppingsString());
        System.out.println("-----------");
    }

    private int getNumberOfToppings()
    {
        int numberOfToppings = 0;

        if (pepperoni) numberOfToppings += 1;
        if (sausage) numberOfToppings += 1;
        if (mushrooms) numberOfToppings += 1;
        if (bacon) numberOfToppings += 1;
        if (onions) numberOfToppings += 1;
        if (extraCheese) numberOfToppings += 1;
        if (peppers) numberOfToppings += 1;
        if (chicken) numberOfToppings += 1;
        if (olives) numberOfToppings += 1;
        if (spinach) numberOfToppings += 1;
        if (tomatoAndBasil) numberOfToppings += 1;
        if (beef) numberOfToppings += 1;
        if (ham) numberOfToppings += 1;
        if (pesto) numberOfToppings += 1;
        if (spicyPork) numberOfToppings += 1;
        if (hamAndPineapple) numberOfToppings += 1;

        return numberOfToppings;
    }

    private String getToppingsString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        if (pepperoni) stringBuilder.append("pepperoni ");
        if (sausage) stringBuilder.append("sausage ");
        if (mushrooms) stringBuilder.append("mushrooms ");
        if (bacon) stringBuilder.append("bacon ");
        if (onions) stringBuilder.append("onions ");
        if (extraCheese) stringBuilder.append("extraCheese ");
        if (peppers) stringBuilder.append("peppers ");
        if (chicken) stringBuilder.append("chicken ");
        if (olives) stringBuilder.append("olives ");
        if (spinach) stringBuilder.append("spinach ");
        if (tomatoAndBasil) stringBuilder.append("tomatoAndBasil ");
        if (beef) stringBuilder.append("beef ");
        if (ham) stringBuilder.append("ham ");
        if (pesto) stringBuilder.append("pesto ");
        if (spicyPork) stringBuilder.append("spicyPork ");
        if (hamAndPineapple) stringBuilder.append("hamAndPineapple ");

        return stringBuilder.toString();
    }
}
