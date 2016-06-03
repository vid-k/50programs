package com.basic;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEquals3g {

        public static void main(String[] args) {
            Map<Object,Object> myHashMap= new HashMap<Object,Object>();
            myHashMap.put("test", "Testing");

            ClassWithHash h1= new ClassWithHash("A123", "Andy", "Anderson");
            ClassWithoutHash h2 = new ClassWithoutHash("B123", "Bob", "Brown");
            ClassWithHash h3 = new ClassWithHash("A123", "Andy", "Anderson"); //same as h1 because we implemented hashcode()
            ClassWithoutHash h4 = new ClassWithoutHash("B123", "Bob", "Brown");;

            myHashMap.put(h1, "Used-Hashing");
            myHashMap.put(h2, "No-Hashing");

            System.out.println(myHashMap.values());
            //System.out.println("containsKey(\"A123\", \"Andy\", \"Anderson\"): " + myHashMap.containsKey("A123"));
            //System.out.println(myHashMap.entrySet().toString());

            System.out.println("Both created with Hashing, are the equal?: " + h1.equals(h3));
            System.out.println("Both created withOUT Hashing, are the equal?: " + h2.equals(h4));
            //System.out.println("One created with Hashing and one withOUT, are the equal?: " + h1.equals(h2));

            System.out.println();
            System.out.println("h3 with Hashing: " + myHashMap.get(h3));
            System.out.println("h4 withOUT Hashing: " + myHashMap.get(h4));

            System.out.println();
            System.out.println("New get of existing value with Hashing: " + myHashMap.get(new ClassWithHash("A123", "Andy", "Anderson")));
            System.out.println("New get of existing value withOUT Hashing: " + myHashMap.get(new ClassWithoutHash("B123", "Bob", "Brown")));
            System.out.println("New get of existing value withOUT Hashing: " + myHashMap.get(new ClassWithoutHash("A123", "Andy", "Anderson")));
            System.out.println("New get of existing value withOUT Hashing: " + myHashMap.get(new ClassWithHash("B123", "Bob", "Brown")));
            System.out.println("New get of non-existing value with Hashing: " + myHashMap.get(new ClassWithHash("C123", "Carla", "Conny")));
        }
}


