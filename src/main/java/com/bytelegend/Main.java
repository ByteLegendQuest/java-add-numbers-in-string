package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (b == null) {
            return a;
        } else if (a == null && b == null) {
            return String.valueOf(0);
        }
    }
}
