package metehan.week4;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetterss("abc", "cab"));
        System.out.println(same("Cydeo123", "12Cy3deo"));

    }

    public static boolean sameLetterss (String s1, String s2) {

        s1 = new TreeSet<>(Arrays.asList(s1.split(""))).toString();
        s2 = new TreeSet<>(Arrays.asList(s2.split(""))).toString();
        return s1.equals(s2);


    }



    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true





    public static boolean same(String s1, String s2) {

        if (s1.length() == 0 || s2.length() == 0)
            return false;

        if (s1.length() != s2.length())
            return false;


        for (int j = 0; j < s2.length(); j++) {
            if (!s2.contains(s1.charAt(j) + "") || !s1.contains(s2.charAt(j) + "")) {
                return false;

            }
            }
        return true ;
        }


    }


