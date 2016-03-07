package com.github.jacksu.polymorphism.shape;

import static com.github.jacksu.utils.Print.print;

/**
 * Created by jack on 16/3/7.
 */
public class Square extends Shape {
    public void draw(){
        print("draw square");
    }
    public void erase(){
        print("erase square");
    }
}
