package amine.week5;

import com.sun.source.tree.Tree;

import java.util.*;

/*String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/
public class W5_FindUnique {

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));

    }

    // method accepts String of letters and returns unique letters as String
    public static String findUnique(String str){
        String result = ""; //to contain uniquLetters

        //TreeSet preserves natural order and only 1 of each letter is present in the set
        Set<String> letters = new TreeSet<>(Arrays.asList(str.split("")));

        //Array List contains all letters of the given string with their duplicates
        List<String> allLetters = new ArrayList<>(Arrays.asList(str.split("")));

        //Iterating through the set to reduce amount of comparison made by the if statement
        for (String letter : letters) {
            //check if the letter is unique, has one copy
            if(Collections.frequency(allLetters,letter) == 1){
                result += letter;
            }
        }

        return result;
    }


}
