package com.github.jacksu.utils;

import java.io.PrintStream;

/**
 * Created by xbsu on 16/3/3.
 * 在屏幕输出的简单实现
 */
public class Print {
    /**
     * 换行输出
     * @param obj 对象
     */
    public static void print(Object obj){
        System.out.println(obj);
    }

    /**
     * 以某种格式输出
     * @param format 格式
     * @param args 参数
     * @return 输出流
     */
    public static PrintStream print(String format, Object ... args){
        return System.out.printf(format,args);
    }
}
