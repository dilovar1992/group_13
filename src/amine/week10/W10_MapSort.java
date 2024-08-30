package amine.week10;

import java.util.*;

/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */
public class W10_MapSort {
    public static void main(String[] args) {
        // Creating an empty HashMap to store keys and values for testing
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Amine", 5);
        map1.put("Zeynep", 8);
        map1.put("Ziyoda", 10);
        map1.put("Metehan", 3);
        map1.put("Dilovar", 7);
        System.out.println("Map before sorting = " + map1);

        sortMapIntValues(map1);

    }

    /**
     * Sort the map by values and display
     * Map is sorted by its value (Integer)
     *
     * @param infoMap
     */
    public static void sortMapIntValues(Map<String, Integer> infoMap) {
        //male list of string array to store key and value pair in an array
        List<List<Object>> keyValuePair = new ArrayList<>();

        //make set for iteration purposes
        Set<String> keys = infoMap.keySet();

        //iterate and create key value pair list of list
        for (String key : keys) {
            List<Object> pair = Arrays.asList(key, infoMap.get(key));
            keyValuePair.add(pair);
        }

        System.out.println("keys of Map = " + keys);
        System.out.println("keyValuePair Before Sort = " + keyValuePair);
        //call method to sort map
        sortListofList(keyValuePair);
        System.out.println("keyValuePair After Sort = " + keyValuePair);

        Map<String,Integer> resultMap = new LinkedHashMap<>();

        for (List<Object> objects : keyValuePair) {
            resultMap.put((String)objects.get(0),(Integer) objects.get(1));

        }

        System.out.println("Sorted map result = " + resultMap);


    }

    /**
     * Method for sorting a list of list made up of, made up of string and integer object pairs
     * @param info
     *
     */

    public static void sortListofList(List<List<Object>> info){

        //traditional sort method adapted to sort list of list based on integer value contained at index 1 of each sublist
        for (int i = 0; i < info.size(); i++) {
            for (int j = 0; j < info.size(); j++) {

                if ((Integer) info.get(i).get(1) < (Integer) info.get(j).get(1)) {
                    List<Object> temp = info.get(j);
                    info.set(j,info.get(i));
                    info.set(i,temp);
                }
            }
        }

    }
}