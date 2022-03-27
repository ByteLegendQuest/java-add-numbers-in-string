package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int v1 = Objects.isNull(a) ? 0 : Integer.parseInt(a);
        int v2 = Objects.isNull(b) ? 0 : Integer.parseInt(b);
        return Integer.toString(v1 + v2);
    }
}
