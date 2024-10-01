package amine.week11;

import java.util.*;

public class MapFrequencyOfChar {

    //Write a method that prints the frequency of each character from a String.

    public static void main(String[] args) {
        String quote = "Golden5golden";

        System.out.println("charFrequency(quote) = " + charFrequency(quote));

    }

    public static String charFrequency(String str) {
        //take lowercase characters and replace space to remove them
        // make String array by splitting
        String[] chars = str.toLowerCase().replace(" ", "").split("");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String each : chars) {

            //add each letter to map and increase value by 1 when it's duplicate
            if (frequencyMap.containsKey(each)) {
                frequencyMap.put(each, frequencyMap.get(each) + 1);

            } else {
                frequencyMap.put(each, 1);
            }
        }

        return concatMapValues(frequencyMap);
    }

    public static String concatMapValues(Map<String, Integer> map) {
        String result = "";
        for (String each : map.keySet()) {
            result += each + map.get(each)+ "  ";

        }
        return result;
    }
}
