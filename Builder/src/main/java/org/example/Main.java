package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Large")
                .setPepperoni(true)
                .setExtraCheese(true)
                .setSausage(true)
                .bakePizza();
        pizza1.eat();

        Pizza pizza2 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Medium")
                .setPepperoni(true)
                .setBeef(true)
                .setBacon(true)
                .setHam(true)
                .setSausage(true)
                .setSpicyPork(true)
                .bakePizza();
        pizza2.eat();

        Pizza pizza3 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Small")
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
    }
}