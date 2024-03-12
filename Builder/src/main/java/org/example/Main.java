package org.example;

public class Main
{
    public static void main(String[] args)
    {
        // First three pizzas, all Pizza Hut
        Pizza pizza1 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.PIZZA_HUT)
                .setSize(Pizza.PizzaSize.SMALL)
                .setPepperoni(true)
                .setExtraCheese(true)
                .setSausage(true)
                .bakePizza();
        pizza1.eat();

        Pizza pizza2 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.PIZZA_HUT)
                .setSize(Pizza.PizzaSize.MEDIUM)
                .setPepperoni(true)
                .setBeef(true)
                .setBacon(true)
                .setHam(true)
                .setSausage(true)
                .setSpicyPork(true)
                .bakePizza();
        pizza2.eat();

        Pizza pizza3 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.PIZZA_HUT)
                .setSize(Pizza.PizzaSize.LARGE)
                .setTomatoAndBasil(true)
                .setSpinach(true)
                .setSpicyPork(true)
                .setPesto(true)
                .setOnions(true)
                .setOlives(true)
                .setPeppers(true)
                .setBacon(true)
                .setPepperoni(true)
                .bakePizza();
        pizza3.eat();

        // Next two Pizza Hut pizzas
        Pizza pizza4 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.PIZZA_HUT)
                .setSize(Pizza.PizzaSize.LARGE)
                .setChicken(true)
                .setPepperoni(true)
                .setSausage(true)
                .bakePizza();
        pizza4.eat();

        Pizza pizza5 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.PIZZA_HUT)
                .setSize(Pizza.PizzaSize.SMALL)
                .setExtraCheese(true)
                .setMushrooms(true)
                .bakePizza();
        pizza5.eat();

        // Next two Little Caesars pizzas
        Pizza pizza6 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.LITTLE_CAESARS)
                .setSize(Pizza.PizzaSize.MEDIUM)
                .setPepperoni(true)
                .setSausage(true)
                .setMushrooms(true)
                .setBacon(true)
                .setOnions(true)
                .setExtraCheese(true)
                .setPeppers(true)
                .setChicken(true)
                .bakePizza();
        pizza6.eat();

        Pizza pizza7 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.LITTLE_CAESARS)
                .setSize(Pizza.PizzaSize.SMALL)
                .setHamAndPineapple(true)
                .setSpicyPork(true)
                .setPesto(true)
                .setHam(true)
                .setBeef(true)
                .setTomatoAndBasil(true)
                .bakePizza();
        pizza7.eat();

        // Next two Dominos pizzas
        Pizza pizza8 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.DOMINOES)
                .setSize(Pizza.PizzaSize.SMALL)
                .setPepperoni(true)
                .bakePizza();
        pizza8.eat();

        Pizza pizza9 = new PizzaBuilder()
                .setChain(Pizza.PizzaChain.DOMINOES)
                .setSize(Pizza.PizzaSize.LARGE)
                .setPepperoni(true)
                .setPeppers(true)
                .setHam(true)
                .bakePizza();
        pizza9.eat();

    }
}