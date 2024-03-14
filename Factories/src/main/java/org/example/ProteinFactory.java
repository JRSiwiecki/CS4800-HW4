package org.example;

public final class ProteinFactory
{
    private static ProteinFactory instance;

    private ProteinFactory(){ }

    public static ProteinFactory getInstance()
    {
        if (instance == null)
        {
            instance = new ProteinFactory();
        }

        return instance;
    }

    public Protein getProtein(String dietPlan)
    {
        String[] proteinOptions;

        switch (dietPlan)
        {
            default:
            case "No Restriction":
            case "Nut Allergy":
                proteinOptions = new String[]{"Fish", "Chicken", "Beef", "Tofu"};
                break;

            case "Paleo":
                proteinOptions = new String[]{"Fish", "Chicken", "Beef"};
                break;

            case "Vegan":
                proteinOptions = new String[]{"Tofu"};
                break;
        }

        return new Protein(Utils.getRandomItemFromArray(proteinOptions));
    }
}
