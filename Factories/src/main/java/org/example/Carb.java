package org.example;

public class Carb extends CarbProduct
{
    @Override
    CarbProduct makeCarb()
    {
        return new Carb();
    }
}
