package com.lzzkill.mountain.util;

public final class StringUtil {
    public static  boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
