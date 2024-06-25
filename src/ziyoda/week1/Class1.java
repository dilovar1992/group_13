package ziyoda.week1;

import java.util.HashMap;
import java.util.Map;

public class Class1 {
    // Method to merge two maps and add values for common keys
    public static Map<String, Integer> mergeAndSumValues(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1); // Initialize the result map with the first map

        // Iterate through the second map
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum); // Merge and sum values
        }

        return result;
    }

    public static void main(String[] args) {
        // Example maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 30);
        map2.put("C", 40);

        // Merge maps and sum values
        Map<String, Integer> mergedMap = mergeAndSumValues(map1, map2);

        // Output the merged map
        System.out.println(mergedMap);
    }
}
