package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int aInt = 0;
        int bInt = 0;
        if (a != null) {
            aInt = Integer.valueOf(a);
        }
        if (b != null) {
            bInt = Integer.valueOf(b);
        }
        return String.valueOf(aInt + bInt);
    }
}
