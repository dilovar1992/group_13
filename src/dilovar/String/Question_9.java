package dilovar.String;

import java.util.*;

public class Question_9 {
    // Write a return method that can find the frequency of characters
    //  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    //  solution 1:
    public static void main(String[] args) {
        String str="ABBQQQQnnQQA";
        System.out.println(frequency(str));


    }
    public static String frequency(String s){
        String result="";
        Set<String> set=new LinkedHashSet<>();
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
        for (String eachString : myList) {
            set.add(eachString+Collections.frequency(myList, eachString));
        }
        for (String string : set) {
            result+=string;
        }
        return result;
    }


}
