package com.github.jacksu.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.github.jacksu.utils.Print.print;

/**
 * Created by jack on 16/3/10.
 */
public class TestRegularExpression {
     public static void main(String[] args){
        for(String arg: args){
            print("Regular Expression:"+arg);
            Pattern p=Pattern.compile(arg);
            Matcher m=p.matcher(args[0]);
            while (m.find()){
                print("Match\""+m.group()+"\" at positions " + m.start()+"-"+(m.end()-1));
            }
        }
    }
}
