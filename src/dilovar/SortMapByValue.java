package dilovar;

import java.util.*;

public class SortMapByValue {
    //method that sorts map by value
    public static void main(String[] args) {
        // Creating an empty HashMap
        Map<String, Integer> hm = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 45);
        hm.put("b", 2);
        hm.put("c", 99);
        hm.put("d", 14);

        System.out.println(sortByValueAsc(hm));
        System.out.println(sortByValueDesc(hm));

    }

    public static Map<String, Integer> sortByValueAsc(Map<String, Integer> hm) {
        //create new arraylist to store values
        ArrayList<Integer> values = new ArrayList<>();
        //create new sorted map sing Linked to maintain insertion order
        Map<String, Integer> sorted = new LinkedHashMap<>();
//to get element from values Arraylist
        int i = 0;
        //this loop return key and value in set
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            //get values and add values to the arraylist
            values.add(entry.getValue());

        }
        ///special method to sort values in ascending order
        SortArrayListAsc.SortAsc(values);
//another  same loop of set of keys and values
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (i < values.size()) {
                //add key from the hm map and get values from arraylist
                sorted.put(e.getKey(), values.get(i));
                //we iterate to get values from arraylist
                i++;

            }

        }

        return sorted;
    }

    public static Map<String, Integer> sortByValueDesc(Map<String, Integer> hm) {
        //create new arraylist to store values
        ArrayList<Integer> values = new ArrayList<>();
        //create new sorted map sing Linked to maintain insertion order
        Map<String, Integer> sorted = new LinkedHashMap<>();
        //to get element from values Arraylist
        int i = 0;
        //this loop return key and value in set
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            //get values and add values to the arraylist
            values.add(entry.getValue());

        }
        ///special method to sort values in ascending order
        SortArrayListDesc.SortDesc(values);
//another  same loop of set of keys and values
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (i < values.size()) {
                //add key from the hm map and get values from arraylist
                sorted.put(e.getKey(), values.get(i));
                //we iterate to get values from arraylist
                i++;

            }

        }

        return sorted;
    }
}
