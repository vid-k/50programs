package com.basic;

import java.io.*;
import java.util.Scanner;

//4. File.
//a. Write a program that takes input from user dynamically using below classes.
//  --> Scanner: Use this class to input 2 integer numbers and sum them.
//  --> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
//  --> DatainputStream: Use this class to input 2 integer numbers and multiply them.
//  --> Console: Use this class to input 2 integer numbers and divide them.

public class File4a {

    public static void useScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scanner: Enter two integers: ");
        int sc_i = sc.nextInt();
        int sc_j = sc.nextInt();
        System.out.println("Addition: " + (sc_i + sc_j));
    }

    public static void useBufferedReader() {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("BufferedReader: Enter two integers: ");
        int br_i=0, br_j=0;
        try {
            br_i = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br_j = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Subtraction: " + (br_i - br_j));
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void useDataInputStream() {
        //this function needs to be fixed. does not work correctly
        System.out.println("DataInputStream: Enter two integers: ");
        DataInputStream ds = new DataInputStream(System.in);
        int ds_i=0, ds_j=0;
        try {
            //reads 4 bytes;
            ds_i = ds.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //reads 4 bytes
            ds_j = ds.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Multiply: " + Math.multiplyExact(ds_i,ds_j));
        try {
            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void useConsole() {
        //Console is not present in an IDE, so will give NullPointerException
        Console co = System.console();
        System.out.println("Console: Enter two integers: ");
        int co_i=0,co_j=0;
        co_i = Integer.parseInt(co.readLine());
        co_j = Integer.parseInt(co.readLine());
        System.out.println("Divide: " + (co_i/co_j));
    }

    public static void main(String args[]) {
        useScanner();
        useBufferedReader();
        useDataInputStream();
        //useConsole();
    }
}
