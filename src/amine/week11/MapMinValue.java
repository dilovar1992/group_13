package amine.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {
    //Write a method that can return the minimum value from a map (Do not use sort method)

    public static void main(String[] args) {

        // Creating an empty HashMap to store keys and values for testing
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Coffee", 5);
        map1.put("Cake", 8);
        map1.put("Ice-cream", 10);
        map1.put("Tea", 3);
        map1.put("Biscuit", 7);
        System.out.println("Map = " + map1);

        System.out.println("findMapMin(map1) = " + findMapMin(map1));

    }
    
    public static Integer findMapMin(Map<String, Integer> info){
        //info.values() --> returns collection
        Object[] values = info.values().toArray();

        //setting minimum number as first item
        Integer min = (Integer) values[0];

        //iterate through values
        for (Object each : values) {
            if( (Integer) each < min){
                min = (Integer) each;
            }
        }
        return min;
    }


}
