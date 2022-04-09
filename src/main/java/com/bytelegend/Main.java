package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        return toInt(a) + toInt(b) + "";

    }

    public static int toInt(String s) {
        if (s != null) {
            return Integer.parseInt(s);
        }
        return 0;
    }
}
