package amine.week4;

import java.util.HashMap;
import java.util.Map;

public class W4_String_Frequency_of_Char {
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

    public static void main(String[] args) {
        String quote = "TO_BE_OR_NOT_TO_BE";
        System.out.println("quote = " + quote);
        System.out.println("frequencyOfChar(quote) = " + frequencyOfChar(quote));
    }

    public static Map<String,Integer> countLetters(String str){
        String [] letters = str.toLowerCase().split("");

        Map<String,Integer> letterCount = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            String key = letters[i];
            if (letterCount.containsKey(key)){

                letterCount.put(key,letterCount.get(key) + 1);
            }else {
                letterCount.put(key,1);
            }

        }
        return letterCount;
    }

    //method accepts String
    //returns given String letters and their count concatenated as String
    public static String frequencyOfChar (String str){

        Map<String,Integer> letterCount= countLetters(str);
        System.out.println(letterCount);
        String result = "";
        for (String each : letterCount.keySet()) {

            result += each + letterCount.get(each);
        }
        return result;

    }
}
