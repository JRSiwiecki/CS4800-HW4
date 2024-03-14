package org.example;

public class Main
{
    public static void main(String[] args)
    {
        MacronutrientFactory macronutrientFactory = MacronutrientFactory.getInstance();

        Customer customer1 = new Customer("Joe", "No Restriction");
        Customer customer2 = new Customer("Jon", "Paleo");
        Customer customer3 = new Customer("Sara", "Vegan");
        Customer customer4 = new Customer("Dave", "Nut Allergy");
        Customer customer5 = new Customer("Caleb", "No Restriction");
        Customer customer6 = new Customer("Tyler", "Nut Allergy");

        customer1.setMeal(macronutrientFactory.makeMeal(customer1));
        customer2.setMeal(macronutrientFactory.makeMeal(customer2));
        customer3.setMeal(macronutrientFactory.makeMeal(customer3));
        customer4.setMeal(macronutrientFactory.makeMeal(customer4));
        customer5.setMeal(macronutrientFactory.makeMeal(customer5));
        customer6.setMeal(macronutrientFactory.makeMeal(customer6));

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
        System.out.println(customer5);
        System.out.println(customer6);
    }
}