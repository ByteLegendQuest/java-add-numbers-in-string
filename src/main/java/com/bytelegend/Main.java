package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        String first = a;
        String second = b;
        if (first == null) {
            first = "0";
        }
        if (second == null) {
            second = "0";
        }
        return String.valueOf(Integer.parseInt(first) + Integer.parseInt(second));
    }
}
