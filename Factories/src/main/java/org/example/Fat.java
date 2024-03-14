package org.example;

public class Fat extends FatProduct
{
    private String name;

    public Fat(String name)
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
    FatProduct makeFat(String name)
    {
        return new Fat(name);
    }
}
