package com.github.jacksu.utils;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by jack on 16/3/16.
 */
public class PPrint {
    public static String pformat(Collection<?> c) {
        if (c.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (Object elem : c) {
            if (c.size() != 1)
                result.append("\n  ");
            result.append(elem);
        }
        if (c.size() != 1)
            result.append("\n");
        result.append("]");
        return result.toString();
    }

    public static String pformat(Object[] o){
        return pformat(Arrays.asList(o));
    }

    public static void pprint(Collection<?> c) {
        System.out.println(pformat(c));
    }

    public static void pprint(Object[] c) {

        System.out.println(pformat(Arrays.asList(c)));
    }
}
