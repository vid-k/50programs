package com.basic;

import java.io.File;

//4. File.
//e. Write a program to show list of all file names in a folder.

public class FileList4e {

    public static void DirReader(String path) {
        File folder = new File(path);
        File listOfFiles[] = folder.listFiles();
        System.out.println(path);
        for (int i=0;i<listOfFiles.length;i++)  {
            if (listOfFiles[i].isFile())
                System.out.println("File: " + listOfFiles[i].getName());
            else if(listOfFiles[i].isDirectory())
                System.out.println("Directory: " + listOfFiles[i].getName());
        }
    }

    public static void main(String args[]) {
        DirReader("c:/Program files");
    }
}
