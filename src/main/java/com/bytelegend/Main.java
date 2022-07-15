package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Integer a2 = 0;
        Integer b2 = 0;

        if (a != null) {
            a2 = Integer.parseInt(a);
        }

        if (b != null) {
            b2 = Integer.parseInt(b);
        }

        return Integer.toString(a2 + b2);
    }
}
