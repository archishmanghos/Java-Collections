package Maps;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();

        // add entries
        mp.put("January", 1);
        mp.put("February", 2);
        mp.put("March", 3);


        // Iterating over HashMap and Displaying values
        Set<Map.Entry<String, Integer>> set = mp.entrySet();
        for (Map.Entry<String, Integer> it : set) {
            System.out.println(it.getKey() + " : " + it.getValue());
        }
        System.out.println();

        Set<String> keys = mp.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + mp.get(key));
        }
        System.out.println();


        // handle null pointer exception
        System.out.println(mp.get("June"));
        System.out.println(mp.getOrDefault("June", -1));
        System.out.println(mp.get("February"));
        System.out.println(mp.getOrDefault("February", -1));
        System.out.println();


        // check if key is present
        System.out.println(mp.containsKey("January"));
        System.out.println(mp.containsKey("June"));
        System.out.println();


        // remove
        mp.remove("January");
        for (String key : mp.keySet()) {
            System.out.println(key + " : " + mp.get(key));
        }
        System.out.println();


        // create an adjacency list using HashMap
        // 1 --- 2
        // 2 --- 3
        // 1 --- 3

        Map<Integer, List<Integer>> adj = new HashMap<>();
        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);
        adj.computeIfAbsent(2, f -> new ArrayList<>()).add(3);
        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(3);
        Set<Integer> k = adj.keySet();
        for (Integer it : k) {
            System.out.print(it + " -> [ ");
            for (int i : adj.get(it)) {
                System.out.print(i + ", ");
            }
            System.out.println("]");
        }
    }
}
