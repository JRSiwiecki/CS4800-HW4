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

    public Carb getCarb(String dietPlan)
    {
        CarbFactory carbFactory = CarbFactory.getInstance();
        String[] carbOptions;

        switch (dietPlan)
        {
            default:
            case "No Restriction":
                carbOptions = new String[]{"Cheese", "Bread", "Lentils", "Pistachio"};
                break;

            case "Paleo":
                carbOptions = new String[]{"Pistachio"};
                break;

            case "Vegan":
                carbOptions = new String[]{"Bread", "Lentils", "Pistachio"};
                break;

            case "Nut Allergy":
                carbOptions = new String[]{"Cheese", "Bread", "Lentils"};
                break;
        }

        return new Carb(Utils.getRandomItemFromArray(carbOptions));
    }
}
