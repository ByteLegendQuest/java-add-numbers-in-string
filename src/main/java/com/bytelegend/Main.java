package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Integer x, y;
        if (a == null) {
            x = 0;
        } else {
            x = Integer.valueOf(a);
        }
        if (b == null) {
            y = 0;
        } else {
            y = Integer.valueOf(b);
        }
        x = x + y;
        return x.toString();
    }
}
