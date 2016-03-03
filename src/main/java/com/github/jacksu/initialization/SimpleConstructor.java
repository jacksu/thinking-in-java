package com.github.jacksu.initialization;

import static com.github.jacksu.utils.Print.*;

/**
 * Created by jacksu on 16/3/2.
 */
class Rock{
    String str;
    String str1="str1";
    String str2;
    Rock(){
        print("Rock");
        str2="str2";
    }
}

public class SimpleConstructor {
    public static void main(String[] args){
        Rock r=new Rock();
        print(r.str);
    }
}
