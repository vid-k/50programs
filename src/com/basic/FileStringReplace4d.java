package com.basic;

import java.io.*;

//4. File.
//d. Write a program to search for a string in a file and then replace it with another string.

public class FileStringReplace4d {

    public static void stringReplace(String filename, String origStr, String repStr) {
        try {
            FileReader in = new FileReader(filename);
            BufferedReader br = new BufferedReader(in);
            String line ="";
            String oldtext="";
            while ((line=br.readLine())!= null) {
                oldtext += line + "\r\n";
            }
            br.close();
            in.close();
            String newtext = oldtext.replaceAll(origStr, repStr);
            FileWriter out = new FileWriter(filename);
            out.write(newtext);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String args[]) {
        stringReplace("FileWordCount.txt","code","PROGRAM");
    }

}
