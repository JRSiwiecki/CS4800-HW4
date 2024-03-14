package org.example;

public class Protein extends ProteinProduct
{
    private String name;

    public Protein(String name)
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
    ProteinProduct makeProtein(String name)
    {
        return new Protein(name);
    }
}
