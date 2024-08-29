package dilovar;

import java.util.*;

public class SortMapByValue {
    //method that sorts map by value
    public static void main(String[] args) {
        // Creating an empty HashMap
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

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
        ArrayList<Integer> values = new ArrayList<>();
        Map<String,Integer> sorted=new LinkedHashMap<>();

        int i=0;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            values.add(entry.getValue());

        }
        SortArrayListAsc.SortAsc(values);

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (i< values.size()){
                sorted.put(e.getKey(), values.get(i));
                i++;

            }

        }

        return sorted;
    }
    public static Map<String, Integer> sortByValueDesc(Map<String, Integer> hm){
        ArrayList<Integer> values = new ArrayList<>();
        Map<String,Integer> sorted=new LinkedHashMap<>();

        int i=0;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            values.add(entry.getValue());

        }
        SortArrayListDesc.SortDesc(values);

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (i< values.size()){
                sorted.put(e.getKey(), values.get(i));
                i++;

            }

        }

        return sorted;
    }
}
