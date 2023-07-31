package Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> mp = new TreeMap<>();
        NavigableMap<Integer, String> ordMp = new TreeMap<>((a, b) -> (b - a));

        // add values
        mp.put(1, "January");
        mp.put(2, "February");
        mp.put(3, "March");
        mp.put(7, "July");

        ordMp.put(1, "January");
        ordMp.put(2, "February");
        ordMp.put(3, "March");


        // Iterate and Display
        Set<Map.Entry<Integer, String>> st = mp.entrySet();
        for (Map.Entry<Integer, String> it : st) {
            System.out.println(it.getKey() + " : " + it.getValue());
        }
        System.out.println();
        for (Integer key : mp.keySet()) {
            System.out.println(key + " : " + mp.get(key));
        }
        System.out.println();

        for (Integer key : ordMp.keySet()) {
            System.out.println(key + " : " + ordMp.get(key));
        }
        System.out.println();

        // remove values
        mp.remove(2);
        for (Integer key : mp.keySet()) {
            System.out.println(key + " : " + mp.get(key));
        }
        System.out.println();

        System.out.println(mp.get(mp.floorKey(3)));
        System.out.println(mp.get(mp.floorKey(5)));
        System.out.println(mp.get(mp.ceilingKey(2)));
        System.out.println(mp.get(mp.ceilingKey(6)));
        System.out.println(mp.get(mp.lowerKey(2)));
        System.out.println(mp.get(mp.higherKey(2)));
    }
}
