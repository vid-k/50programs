package com.basic;


public class Car8e {

    String model;

    static {
        System.out.println("In the static block");
    }

    public Car8e(String model) {
        System.out.println("In the constructor");
        this.model = model;
    }

    public static String whatModel(Car8e x) {
        System.out.println("In the static method");
        return x.model;
    }

    public static void main(String args[]) {
        Car8e c1 = new Car8e("Nissan Rogue");
        System.out.println("In main --- " + whatModel(c1));
    }
}
