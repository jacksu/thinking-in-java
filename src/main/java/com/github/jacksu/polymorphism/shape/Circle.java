package com.github.jacksu.polymorphism.shape;

import static com.github.jacksu.utils.Print.print;

/**
 * Created by jack on 16/3/7.
 */
public class Circle extends Shape {
    @Override public void draw(){
        print("draw circle");
    }
    public void erase(){
        print("erase circle");
    }
}
