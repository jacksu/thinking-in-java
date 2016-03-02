package com.github.jacksu;
//: First.java
import java.awt.*;
import java.util.Date;

/**
 * Hello world!
 * 第一个测试程序
 * @author jacksu
 * @author 371387455@qq.com
 * @version 1.0
 */
public class First
{
    /**
     * 程序入口函数
     * @param args 传入command参数
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(new Date());
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}/* Output:
*///:~
