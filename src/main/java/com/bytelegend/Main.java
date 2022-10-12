package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
       int n = a != null ? Integer.parseInt(a) : 0;
       int m = b != null ? Integer.parseInt(b) : 0;

       return (a + b).toString();
    }
}
