package com.github.jacksu.utils;

import org.junit.Assert;
import junit.framework.TestCase;

import static com.github.jacksu.utils.Range.*;
import static com.github.jacksu.utils.Print.*;

/**
 * Created by xbsu on 16/3/3.
 */
public class RangeTest extends TestCase {

    public void testRange() {
        int[] var = {0, 1};
        print(range(2).toString());
        Assert.assertArrayEquals(var, range(2));
        Assert.assertArrayEquals(new int[]{3, 4, 5}, range(3, 6));
        Assert.assertArrayEquals(new int[]{3, 5}, range(3, 6, 2));
        Assert.assertArrayEquals(new int[]{3, 5, 7}, range(3, 9, 2));
    }
}
