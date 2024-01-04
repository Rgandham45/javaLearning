import java.util.*;

public class DoubleMaps {
    public static void main(String[] args) {
        Map<Integer, String> detail = new HashMap<>();
        detail.put(54, "rambabu");
        detail.put(50, "madhavi");
        detail.put(24, "rahul");
        detail.put(11, "goutham");

        // Create a list of map entries
        List<Map.Entry<Integer, String>> lst = new ArrayList<>(detail.entrySet());

        // Define a custom comparator based on the integer keys
        Comparator<Map.Entry<Integer, String>> comp = new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> i, Map.Entry<Integer, String> j) {
                return i.getKey().compareTo(j.getKey());
            }
        };

        // Sort the list using the custom comparator
        Collections.sort(lst, comp);

        // Create a new LinkedHashMap to store the sorted entries
        Map<Integer, String> sortedMap = new LinkedHashMap<>();

        // Populate the sorted map with the sorted entries
        for (Map.Entry<Integer, String> entry : lst) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map values are: ");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
