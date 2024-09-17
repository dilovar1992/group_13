package dilovar.Maps;

import java.util.*;

public class MapMinValue {
    //write a method that can return the minimum value from a map
    // do not use sort method
    public static void main(String[] args) {
        Map<String, Object> hm = new HashMap<>();
        hm.put("Abdu", 11);
        hm.put("Zakha", 13);
        hm.put("Jonnor", 2);

        minValueFromMap(hm);

    }



    public static void minValueFromMap( Map<String, Object> hm){
            List<Integer> values=new ArrayList<>();

            for (Map.Entry<String, Object> entry : hm.entrySet()) {

                values.add((Integer) entry.getValue());

            }

            int minValue=30;
            for (Integer value : values) {
                if (minValue>value){
                    minValue=value;
                }
            }

            System.out.println("minimum value is = "+minValue);
        }
    }





