package com.github.jacksu.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jack on 16/3/16.
 */
public class BufferedInputFile {
    public static String
    read(String filename) throws IOException {
        String s;
        StringBuilder sb = new StringBuilder();
        // Reading input by lines:
        try {
            FileReader file = new FileReader(filename);
            BufferedReader in = new BufferedReader(file);
            try {
                while ((s = in.readLine()) != null)
                    sb.append(s + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.print(read("src/main/java/com/github/jacksu/io/BufferedInputFile.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
