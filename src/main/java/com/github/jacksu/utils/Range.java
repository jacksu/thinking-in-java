package com.github.jacksu.utils;

/**
 * Created by xbsu on 16/3/3.
 */
public class Range {
    /**
     * 生成0..n-1的数组
     *
     * @param n
     * @return 数组
     */
    public static int[] range(int n) {
        int i = 0;
        int[] result = new int[n];
        for (i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     * 产生数组重载
     *
     * @param begin 开始值
     * @param end   结束值
     * @return 数组
     */
    public static int[] range(int begin, int end) {
        int i;
        int[] result = new int[end - begin];
        for (i = 0; i < end - begin; i++) {
            result[i] = begin + i;
        }
        return result;
    }

    /**
     * 根据给定步长产生数组
     *
     * @param begin 开始值
     * @param end   结束值
     * @param step  步长
     * @return 产生的数组
     */
    public static int[] range(int begin, int end, int step) {
        assert (step != 0);
        int i;
        int length=(int) Math.round((end - begin) * 1.0 / step);
        int[] result = new int[length];
        //System.out.println(Math.round((end - begin) * 1.0 / step));
        for (i = 0; i < length; i++) {
            result[i] = begin + i * step;
        }
        return result;
    }
}
