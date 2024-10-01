package dilovar.String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question_10 {
    //  Write a return method that can remove the duplicated values from String
    //  Ex:  removeDup("AAABBBCCC")  ==> ABC

    //  Solution 1:
    public static void main(String[] args) {
        String str="AAABBBCCghghghghgghnnnnnnC";
        System.out.println(removeDuplicates(str));

    }
    public static String removeDuplicates(String str){
        String result="";
        Set<String> stringSet=new LinkedHashSet<>(Arrays.asList(str.split("")));
        for (String string : stringSet) {
            result+=string;
        }
        return result;
    }
}
