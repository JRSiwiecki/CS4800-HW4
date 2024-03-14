package org.example;

import java.util.Random;

public class Utils
{
    public static String getRandomItemFromArray(String[] array)
    {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
}
