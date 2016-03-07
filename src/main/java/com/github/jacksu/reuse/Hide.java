package com.github.jacksu.reuse;

import static com.github.jacksu.utils.Print.*;

/**
 * Created by jack on 16/3/5.
 */
class Homer{
    char doh(char c){
        print("doh(char)");
        return c;
    }
    float doh(float f){
        print("doh(float)");
        return f;
    }
}

class Milhouse{}

class Bart extends Homer{

}
public class Hide {
}
