package amine.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class W4_String_Same_Letters {

    /*
    String -- Same letters
    Write a return method that check if a string is build out of the
    same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:
     */
    public static void main(String[] args) {
        String str1 = "Teams";
        String str2 = "Meat"; //Bayraminiz mubarek olsun

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println(isEqual(str1,str2));

        String str3 = "Silent";
        String str4 = "Listen";

        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println(isEqual(str3,str4));


    }

    public static Map<String,Integer> countLetters(String str){
        str = str.toLowerCase();
        String [] letters = str.split("");
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

    public static boolean isEqual(String str1, String str2){

        Map<String,Integer> map1 = countLetters(str1);
        Map<String,Integer> map2 = countLetters(str2);

        return map1.equals(map2);
    }
}
