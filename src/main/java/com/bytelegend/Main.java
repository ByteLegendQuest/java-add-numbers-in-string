package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a == null) {
            return 0 + (int) b;
            if (b == null) {
                return 0;
            }
        }
        return (int) a + (int) b;
    }
}
