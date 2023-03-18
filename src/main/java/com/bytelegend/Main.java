package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }
    public static String add(String a, String b) {
        int c = 0;
        int d = 0;
        if (a != null) {
            c = Integer.parseInt(a);;
        }
        if (b != null) {
            d = Integer.parseInt(b);
        }
        return String.valueOf(c + d);
    }
}
