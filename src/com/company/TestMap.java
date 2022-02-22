package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
	// write your code here
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("DT",23);
        hashMap.put("LT",26);
        hashMap.put("TD",20);
        hashMap.put("HP",18);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("\nDisplay entries in ascending order of key");
        System.out.println(treeMap);

//        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
//        System.out.println("The age for DT is " + linkedHashMap.get("DT"));
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("DT",23);
        linkedHashMap.put("LT",26);
        linkedHashMap.put("TD",20);
        linkedHashMap.put("HP",18);
        System.out.println("\nThe age for DT is " + linkedHashMap.get("DT"));
    }
}
