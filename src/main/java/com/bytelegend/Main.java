package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Integer aa = 0;
        Integer bb = 0;
        if (a != null) {
            aa = Integer.valueOf(a);
        }
        if (a != null) {
            bb = Integer.valueOf(b);
        }

        int result = aa + bb;
        return String.valueOf(result);
    }
}
