package com.basic;

//8. File.
//a. Write an Immutable class.

public final class ImmutableClass8a {
    //private variables and initialized in the constructor
    //no SETTER methods
    private final String name;
    private final int age;
    private ImmutableClass8a(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String args[]) {
        ImmutableClass8a m = new ImmutableClass8a("Mark", 25);
        //m.name = "Neev"; //this will fail since name is defined as final
        System.out.println(m.getName() + " " + m.getAge());
    }

}
