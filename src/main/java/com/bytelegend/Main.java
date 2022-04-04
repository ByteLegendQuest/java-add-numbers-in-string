package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Intger a1 = null;
        Intger b1 = null;
        if (a == null) a1 = 0;
        if (b == null) b1 = 0;
        return (a1 + b1).toString();
    }
}
