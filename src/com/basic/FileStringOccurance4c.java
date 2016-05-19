package com.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStringOccurance4c {

    public static int stringOccurance(String filename, String str) {
        int strMatchCount = 0;
        try {
            FileReader in = new FileReader(filename);
            BufferedReader br = new BufferedReader(in);
            String line = br.readLine();
            strMatchCount = 0;
            while (line != null) {
                String word[] = line.split(" ");
                for (int i = 0; i < word.length; i++)
                    if (word[i].equals(str))
                        strMatchCount++;
                line = br.readLine();
                br.close();
                in.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The word \" "+ str+ " \" occurs " + strMatchCount+ " number of times.");
        return strMatchCount;
    }

    public static void main(String args[]) {
        stringOccurance("FileWordCount.txt","This");
        stringOccurance("FileWordCount.txt","is");
    }
}
