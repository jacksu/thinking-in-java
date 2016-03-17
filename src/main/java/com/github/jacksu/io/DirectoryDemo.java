package com.github.jacksu.io;

import com.github.jacksu.utils.Directory;
import com.github.jacksu.utils.PPrint;

import java.io.File;

import static com.github.jacksu.utils.Print.print;

/**
 * Created by jack on 16/3/16.
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        // All directories:
        PPrint.pprint(Directory.walk(".").dirs);
        // All files beginning with 'T'
        for(File file : Directory.local(".", "T.*"))
            print(file);
        print("----------------------");
        // All Java files beginning with 'T':
        for(File file : Directory.walk(".", "T.*\\.java"))
            print(file);
        print("======================");
        // Class files containing "Z" or "z":
        for(File file : Directory.walk(".",".*[Zz].*\\.class"))
            print(file);
    }
}
