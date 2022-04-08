package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int actualA = 0;
        int actualB = 0;
        if (a != null) {
            actualA = Integer.parseInt(a);
        }
        if (b != null) {
            actualB = Integer.parseInt(b);
        }
        return Integer.toString(actualA + actualB);
    }
}
