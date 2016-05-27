package com.basic;

import java.util.HashMap;

//5. Arrays.
//d. Write a program having below methods.
//--> To create a hashmap.
//--> To search for a key in the created map and then returns its value.

public class HashMap5d {

    public static String getValueOfKey(HashMap myHT, int key) {
        if (myHT.containsKey(key))
            return myHT.get(key).toString();
        return "None";
    }

    public static void main(String args[]) {
        HashMap<Integer, String> myHT = new HashMap();
        myHT.put(1,"Kitchen");
        myHT.put(2,"Living Room");
        myHT.put(4,"Dining Room");
        myHT.put(5,"Bathroom");
        myHT.put(3,"Bedroom");

        int k = 1;
        System.out.println("The value in key " + k + " is " + getValueOfKey(myHT, k) + ".");
    }
}
