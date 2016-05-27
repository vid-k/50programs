package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//5. Arrays:
//a. Write a program having different methods to perform below operations.
//      --> To create an arraylist and add elements to it.
//      --> To search for an element in the list.
//      --> To print the elements of the list using iterator.
//      --> To print the elements in the reverse order using ListIterator.

public class Arraylist5a {

    public static ArrayList createArrayList() {
        System.out.println("Create Arraylist");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("San Francisco");
        arr.add("Houston");
        arr.add("Reno");
        arr.add("New York");
        return arr;
    }

    public static void searchArrayList(ArrayList<String> arr, String str) {
        System.out.println("-------------\nSearch Arraylist");
        int bool = Collections.binarySearch(arr, str);
        if (bool < 0)
            System.out.println("\"" + str + "\" does not exist in the ArrayList.");
        else
            System.out.println("\"" + str + "\" exists in the ArrayList.");
    }

    public static void printArrayList(ArrayList<String> arr) {
        System.out.println("-------------\nPrint Arraylist::");
        Iterator<String> itr = arr.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }

    public static void reverseArrayList(ArrayList<String> arr) {
        System.out.println("-----------\nReverse Print Arraylist::");
        ListIterator<String> litr = arr.listIterator(arr.size());
        while(litr.hasPrevious())
            System.out.println(litr.previous());
    }

    public static void main(String args[]) {
        ArrayList<String> arr = createArrayList();
        searchArrayList(arr, "Reno");
        printArrayList(arr);
        reverseArrayList(arr);
    }

}
