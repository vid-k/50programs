package com.basic;

//8. General.
//c. Write a program implementing explicit garbage collection.

//Is it correct that System.gc() may not always perform GC ?
//What should happen to name, name1 and first, second after System.gc() ?

public class ExplicitGC8c {

    public static class Car {
        Car x;
    }


    public static void main(String args[]) {
        StringBuffer name = new StringBuffer("Madison");
        name = null;
        System.out.println("name: " + name);

        StringBuffer name1 = new StringBuffer("New York");
        StringBuffer name2 = new StringBuffer("Kentucky");
        name1 = name2;
        System.out.println("name1: " + name1);
        System.out.println("name1: " + name2);

        Car first = new Car();
        Car second = new Car();
        first.x = second;
        second.x = first;
        System.out.println("first.x: " + first.x);
        System.out.println("second.x: " + second.x);
        first = null;
        second = null;

        System.gc();
        System.out.println("\n-------------\nAfter gc\n------------");
        System.out.println("name: " + name);
        System.out.println("name1: " + name1);
        System.out.println("name1: " + name2);
        System.out.println("first.x: " + first.x);
        System.out.println("second.x: " + second.x);

    }
}
