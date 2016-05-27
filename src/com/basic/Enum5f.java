package com.basic;

import java.util.EnumSet;
import java.util.Iterator;

//5. Collections.
//f. Write a program that defines an enum having months of the year and then prints the value of all the enum elements.

public class Enum5f {

    private enum Month {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private int monthNumber;
        private Month(int value){
            this.monthNumber = value;
        }

    }

    public static void main(String args[]) {
        for (Month m: Month.values())
            System.out.println(m.monthNumber+ " " + m.name());
    }
}
