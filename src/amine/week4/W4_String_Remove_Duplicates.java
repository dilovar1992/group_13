package amine.week4;

import java.util.*;

public class W4_String_Remove_Duplicates {

    /*
    String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println("removeDuplicates(str) = " + removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {

        //Using HashSet, set has only unique letters, but random order
//        Set<String> uniqueLetters = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            uniqueLetters.add(str.substring(i, i + 1));

        //Making a list to containg all letters of the given string
        List<String> uniqueLetters = new ArrayList<>(Arrays.asList(str.split("")));

        //making Iterator object in order to loop through the list and alter the list
        Iterator <String> iterator = uniqueLetters.iterator();

        while(iterator.hasNext()){//loop runs until the iterator has item

            //letter is removed if its frequency is higher than 1
            if (Collections.frequency(uniqueLetters,iterator.next()) > 1){
                iterator.remove();
            }
        }

        //concatenation of unique letters
        String result = "";
        for (String each : uniqueLetters) {
            result += each;

        }
        return result;
    }
}



