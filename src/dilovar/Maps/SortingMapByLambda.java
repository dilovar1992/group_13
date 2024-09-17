package dilovar.Maps;

import java.util.*;
import java.lang.*;

public class SortingMapByLambda {
    public static void main(String[] args) {

        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        System.out.println("sortByValue = " + sortByValue(hm));


    }

    // function to sort hashmap by values
    public static Map<String, Integer>
    sortByValue(HashMap<String, Integer> hm) {
//create list of entries
        List<Map.Entry<String, Integer>> entrySet = new LinkedList<>(hm.entrySet());

        //use sort method and compareTo with lambda method
        //change position of the i, j you get sort in descending order
        Collections.sort(entrySet, (i, j) -> i.getValue().compareTo(j.getValue()));

        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> map : entrySet) {
            sorted.put(map.getKey(), map.getValue());

        }
        return sorted;
    }
}








