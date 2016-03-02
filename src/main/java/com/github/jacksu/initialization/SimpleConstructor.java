package com.github.jacksu.initialization;

/**
 * Created by jacksu on 16/3/2.
 */
class Rock{
    String str;
    String str1="str1";
    String str2;
    Rock(){
        System.out.println("Rock");
        str2="str2";
    }
}

public class SimpleConstructor {
    public static void main(String[] args){
        Rock r=new Rock();
        System.out.println(r.str);
    }
}
