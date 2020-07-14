package ngay12_thuchanh;

import java.util.*;

public class HashMap_TreeMap_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        hashMap.put("Smith",50);
        hashMap.put("Tom",45);
        System.out.println(hashMap);

//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);
//
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Smith", 30);
//        linkedHashMap.put("Anderson", 31);
//        linkedHashMap.put("Lewis", 29);
//        linkedHashMap.put("Cook", 29);
//        linkedHashMap.forEach((s, integer) -> System.out.println(s + "=" + integer));
//
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
