package com.basic;

import java.util.HashSet;
import java.util.Set;

//5. Collections.
//b. Write a program to find duplicates in an array using set.

public class Set5b {

    public static void findDuplicates(int arr[]) {
        Set<Integer> s = new HashSet<Integer>();
        int bool = 0;
        for (int i=0;i<arr.length;i++) {
            if (!s.add(arr[i]))
                    System.out.println(arr[i] + " at position " + i + " is a duplicate entry from the array");
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 6, 10, 8, 5, 3, 7, 8};
        findDuplicates(arr);
    }
}
