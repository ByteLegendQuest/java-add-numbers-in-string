package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a == null) {
            int a1 = 0;
            int b1 = Integar.valueOf(b);
            return String.valueOf(a1 + b1);
        }
        else if (b == null) {
            int b1 = 0;
            int a1 = Integar.valueOf(a);
            return String.valueOf(a1 + b1);
        }
        else if (a == null && b == null) {
            return "0";
        }
        else {
            int a1 = Integar.valueOf(a);
            int b1 = Integar.valueOf(b);
            return String.valueOf(a1 + b1);
        }
    }
}
