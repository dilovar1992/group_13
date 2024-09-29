package dilovar.String;

import java.util.Arrays;
import java.util.TreeSet;

public class Question_11 {
    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true
    public static void main(String[] args) {
        String str1="abcqm";
        String str2="cabq";
        System.out.println(areTheyEqual(str1, str2));

    }


    public static boolean areTheyEqual(String str1,String str2) {
        TreeSet<String> tr2=new TreeSet<>(Arrays.asList(str2.split("")));
        TreeSet<String> tr1=new TreeSet<>(Arrays.asList(str1.split("")));
        return tr1.equals(tr2);
    }
}
