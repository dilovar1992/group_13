package amine.week11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMinValue {
    //Write a method that can return the minimum value from a map (Do not use sort method)

    public static void main(String[] args) {

        // Creating an empty HashMap to store keys and values for testing
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Amine", 5);
        map1.put("Zeynep", 8);
        map1.put("Ziyoda", 10);
        map1.put("Metehan", 3);
        map1.put("Dilovar", 7);
        System.out.println("Map = " + map1);

        System.out.println("findMapMin(map1) = " + findMapMin(map1));

    }
    
    public static Integer findMapMin(Map<String, Integer> info){
        //info.values() --> returns collection

        Object[] values = info.values().toArray();

        //iterate through values
        Integer min = (Integer) values[0];
        for (Object each : values) {
            if( (Integer) each < min){
                min = (Integer) each;
            }
        }
        return min;

    }


}
