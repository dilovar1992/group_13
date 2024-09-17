package dilovar.Maps;

import java.util.*;

public class sortMapByKeys {
    //sort map by keys
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(123,"Sabina");
        map.put(12,"Sabrina");
        map.put(3,"Sabzina");

        System.out.println(sortMapByKey(map));
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Abdu", 14);
        hm.put("Zakha", 1);
        hm.put("Jonnor", 29);

        System.out.println(sortMapByKey2(hm));


    }
    public static Map<Integer,String> sortMapByKey(Map<Integer,String> map){
       //create list to add keys
        List<Integer> key=new ArrayList<>();

//loop over entry to get key and value
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            key.add(entry.getKey());
        }

        //sort
        Collections.sort(key);

        //create new Map to store sorted
        Map<Integer,String> sorted=new LinkedHashMap<>();

        //create loop of keys
        for (Integer k : key) {
            sorted.put(k,map.get(k));

        }

        return sorted;
    }
    public static Map<String,Integer> sortMapByKey2(Map<String,Integer> hm){
        //store entries in list
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hm.entrySet());

        //sort using comparator interface compareTo method and lambda
        Collections.sort(list,(i,j)->i.getKey().compareTo(j.getKey()));
        //store new sorted Map
        Map<String,Integer> sorted=new LinkedHashMap<>();
        //create the loop to get entries
        for (Map.Entry<String, Integer> entry : list) {
            sorted.put(entry.getKey(),entry.getValue());
        }

        return sorted;
    }
}
