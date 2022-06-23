package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a.isEmpty()) {
            a = "0";
        }
        if (b.isEmpty()) {
            b = "0";
        }
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
