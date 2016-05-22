package com.basic;

import java.util.*;

public class MapSort5e {

    public static TreeMap<String, String> sortByValue(HashMap unsortedmap) {
        TreeMap<String, String> sortedmap = new TreeMap<>(new ValueComparator5e(unsortedmap));
        sortedmap.putAll(unsortedmap);
        return sortedmap;
    }


    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("5", "orange");
        map.put("2", "apple");
        map.put("3", "mango");
        map.put("4", "banana");
        map.put("1", "watermelon");
        System.out.println(map);

        TreeMap<String, String> tMap = sortByValue(map);
        System.out.println("Sorted map: " + tMap);
    }
}
