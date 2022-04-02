package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int s = 0;
        if (a == null && b == null) {
            s = 0 + 0;
        } else if (a == null) {
            s = 0 + Integer.parseInt(b);
        } else if (b == null) {
            s = Integer.parseInt(a) + 0;
        } else {
         s = Integer.parseInt(a) + Integer.parseInt(b);
        }
        return String.valueOf(s);
    }
}
