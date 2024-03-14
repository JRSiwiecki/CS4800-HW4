package org.example;

public final class FatFactory
{
    private static FatFactory instance;

    private FatFactory()
    {
    }

    public static FatFactory getInstance()
    {
        if (instance == null)
        {
            instance = new FatFactory();
        }

        return instance;
    }

    public Fat getFat(String dietPlan)
    {
        String[] fatOptions;

        switch (dietPlan)
        {
            default:
            case "No Restriction":
                fatOptions = new String[]{"Avocado", "Sour Cream", "Tuna", "Peanuts"};
                break;

            case "Paleo":
                fatOptions = new String[]{"Avocado", "Tuna", "Peanuts"};
                break;

            case "Vegan":
                fatOptions = new String[]{"Avocado", "Peanuts"};
                break;

            case "Nut Allergy":
                fatOptions = new String[]{"Avocado", "Sour Cream", "Tuna"};
                break;
        }

        return new Fat(Utils.getRandomItemFromArray(fatOptions));
    }
}
