package dilovar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveSpecificElementFromAnArray {
    /**
     * Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
     * Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed","Dilovar"));
        System.out.println(removeElement(names, "Ahmed"));

    }
    public static ArrayList<String> removeElement(ArrayList<String> arr,String element){
        arr.removeIf(d->d.equals(element));
        return arr;

    }
}
