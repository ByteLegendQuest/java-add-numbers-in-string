package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        return "" + (Integer.parseInt(a == null ? "0" : a) + Integer.parseInt(b == null ? "0" : b));
    }
}
