package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int a = 0, b = 0;
        if (null != a) {
            a = Integer.parseInt(a);
        }
        if (null != b) {
            b = Integer.parseInt(b);
        }
        return a + b + "";
    }
}
