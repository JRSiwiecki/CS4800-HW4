package org.example;

public class Carb extends CarbProduct
{
    private String name;

    public Carb(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    CarbProduct makeCarb(String name)
    {
        return new Carb(name);
    }
}
