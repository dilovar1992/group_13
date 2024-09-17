package dilovar.Maps;

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
        System.out.println("sortMapAsc = " + sortMapAsc(hm));


    }
    public static Map<String,Integer> sortMapAsc(Map<String,Integer> hm){
        //create arraylist of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
        // Map.Entry.comparingByValue() creates a comparator that compares the values of two Map.Entry objects.
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        return sorted;
    }
}
