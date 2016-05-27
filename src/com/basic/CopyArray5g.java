package com.basic;

import java.util.ArrayList;

//5. Arrays.
//g. Write a program to copy arraylist to an array.

public class CopyArray5g {

    public static void main(String args[]) {
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr)
            System.out.println(str);

        System.out.println("--------------------");
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(100);
        alist.add(200);
        alist.add(300);
        alist.add(400);
        System.out.println("Actual ArrayList:"+alist);
        Integer[] iArr = new Integer[alist.size()];
        alist.toArray(iArr);
        System.out.println("Created Array content:");
        for(Integer a:iArr)
            System.out.println(a);

    }
}
