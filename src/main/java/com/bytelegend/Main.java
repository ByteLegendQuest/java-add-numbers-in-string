package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int ret = valueOf(a) + valueOf(b);
        return "" + ret;
    }
    public static int valueOf(String a) {
        if (a == null || a.length() < 1) {
            return Integer.valueOf("0");
        }
        return Integer.valueOf(a);
    }
}
