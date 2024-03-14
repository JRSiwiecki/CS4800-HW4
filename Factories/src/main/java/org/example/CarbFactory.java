package org.example;

public final class CarbFactory
{
    private static CarbFactory instance;

    private CarbFactory(){ }

    public static CarbFactory getInstance()
    {
        if (instance == null)
        {
            instance = new CarbFactory();
        }

        return instance;
    }
}
