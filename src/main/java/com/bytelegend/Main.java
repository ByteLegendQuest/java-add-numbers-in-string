package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        return parseOr0(a) + parseOr0(b);
    }

    private static int parseOr0(String str) {
        return str == null ? 0 : Integer.parseInt(str);
    }

}

