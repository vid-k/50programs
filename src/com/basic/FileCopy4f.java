package com.basic;

import java.io.*;

public class FileCopy4f {

    public static void fileCopy(String fromFile, String toFile) {
        try {
            FileReader in = new FileReader(fromFile);
            BufferedReader br = new BufferedReader(in);
            File f = new File(toFile);
            if(!f.exists()) {
                f.createNewFile();
                System.out.println("File does not exist, new file created");
            }
            if (f.exists()) {
                FileWriter writer = new FileWriter(f);
                String line = "";
                while ((line = br.readLine()) != null) {
                    writer.write(line + "\r\n");
                }
                writer.close();
            }
            br.close();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);
        fileCopy("FileWordCount.txt","Copy.txt");
    }
}
