package com.basic;

import java.util.*;


public class Transpose5c {

    public static void main(String args[]) {
        //Using a 2 dimension array
        String[][] darr = {
                {"a1", "a2", "a3", "a4"},
                {"b1", "b2", "b3", "b4"},
                {"c1", "c2", "c3", "c4"}
        };

        int rows = darr.length;
        int cols = darr[0].length;
        System.out.print("Input: ");
        for (int i=0; i<rows; i++)
            for (int j = 0; j<cols; j++)
                System.out.print(darr[i][j] + " ");

        //can move the following into a separate function also
        System.out.print("\nOutput: ");
        for (int i=0; i<cols; i++)
            for (int j=0; j<rows; j++)
                System.out.print(darr[j][i] + " ");
    }

}


