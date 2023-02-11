package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (b == null) {
            if (a == null) {
                return "0";

            }
            return a;

        }
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
