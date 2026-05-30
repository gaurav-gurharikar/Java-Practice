import java.util.*;
public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India", 120);
        map.put("US", 80);
        map.put("China", 100);
        map.put("Russia", 80);
        System.out.println(map);

        //Update value
        map.put("China", 110);
        System.out.println(map);

        //Delete
        map.remove("Russia");
        System.out.println(map);
        
        //Search key
        System.out.println(map.containsKey("India"));
        
        //Search value
        System.out.println(map.containsValue(110));

        //Search value for a key
        System.out.println(map.get("India"));
        System.out.println(map.get("abc"));

        //Get all values
        Collection<Integer> values = map.values();
        System.out.println(values);

        //Iteration
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Make a set of all the keys
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key);
        }
    }
}
