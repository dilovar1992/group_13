package dilovar.Maps;

import java.util.*;

public class MapFrequencyOfCharacters {
    //write a method that prints the frequency of each character from  a string

    public static void main(String[] args) {

        String str="nfsndfklsnfknvkdsjvn";


        System.out.println(frequencyOfCharacters(str));
        frequencyOfCharacters2(str);

    }

    public static Map<Character,Integer> frequencyOfCharacters(String str){
        //create map to remove duplicates
        Map<Character,Integer> noDuplicates=new HashMap<>();
        //convert String to char array
        char[] chars = str.toCharArray();
        // count
        int count=0;

        // 1st loop through array
        for (int i = 0; i < chars.length; i++) {

            //second loop of array to compare
            for (int j = 0; j < chars.length; j++) {
                //if duplicates are found
                if (chars[i]==chars[j]){
                    // increase count
                    count++;
                }
            }
            // add characters and frequency in key value format
            noDuplicates.put(chars[i],count);

            //reset the count to zero
            count=0;

        }

        return noDuplicates;
    }
    public static void frequencyOfCharacters2(String str){
        //create map to remove duplicates
        //Map<Character,Integer> noDuplicates=new HashMap<>();
        //convert String to char array
        char[] chars = str.toCharArray();
        // count
        int count=0;

        // 1st loop through array
        for (int i = 0; i < chars.length; i++) {



            //second loop of array to compare
            for (int j = 0; j < chars.length; j++) {
                //if duplicates are found
                if (chars[i]==chars[j]){
                    // increase count
                    count++;
                }
            }

            // add characters and frequency in key value format
            //noDuplicates.put(chars[i],count);
            System.out.println(chars[i]+" = "+count);
            //reset the count to zero
            count=0;

        }


    }
}
