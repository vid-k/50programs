package com.basic;


import java.io.*;

public class FileWordCount4b {

    public static int wordCount(String filename) {
        int wc = 0;

        try {
            FileReader in = new FileReader(filename);
            BufferedReader br = new BufferedReader(in);
            int counter = 0;
            String line = br.readLine();
            while (line != null) {
                String a[] = line.split(" ");
                for (counter = 0; counter < a.length; counter++) {
                    if (a[counter].length() > 0)
                        wc++;
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wc;
    }

    public static void main(String args[]) {
        System.out.println("WordCount = " +
                wordCount("FileWordCount.txt")
        );
    }
}
