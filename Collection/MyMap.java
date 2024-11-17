
//Hashmap=> store value in key-value pair and key should be unique.
//Hashmap=>unordered , O(1)
//TreeMap=> Sorted according to key, O(log n)
import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        // Country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("china", 180);
        System.out.println(map);// {china=180, US=30, India=120}

        map.put("china", 200);
        System.out.println(map);// {china=200, US=30, India=120}

        // Search
        System.out.println(map.containsKey("china"));// true
        System.out.println(map.containsValue(200));// true
        System.out.println(map.get("china"));// 200
        System.out.println(map.get("China"));// null

        // iteration in hashmap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            // System.out.print(e.getKey());
            // System.out.print(e.getValue());
        }

        // removing
        map.remove("china");
        System.out.println(map);// {US=30, India=120}

        // Accessing key
        for (String key : map.keySet())
            // System.out.print(key + " ");//US India

            // Accessing value
            for (Integer value : map.values())
                System.out.print(value + " ");

        map.clear();
        System.out.println(map);// {}

    }

}
