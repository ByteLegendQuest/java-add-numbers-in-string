package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (null == a)
            return null == b ? "0" : b;
        if (null == b)
            return a;
        return Integer.valueOf(a) + Integer.valueOf(b) + "";
    }
}
