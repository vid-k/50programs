package com.basic;

import java.util.Comparator;
import java.util.HashMap;

class ValueComparator5e implements Comparator<String> {

    HashMap<String, String> map = new HashMap<>();

    public ValueComparator5e(HashMap<String, String> map) {
            this.map.putAll(map);
    }

    @Override
    public int compare(String s1, String s2) {
        if (map.get(s1).compareTo(map.get(s2)) > 0)
            return 1;
        else if (map.get(s1).compareTo(map.get(s2)) < 0)
            return -1;
        else
            return 0;

    }
}
