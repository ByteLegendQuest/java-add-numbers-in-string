package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int aa = 0, bb = 0;
        if (null != a) {
            aa = Integer.parseInt(a);
        }
        if (null != b) {
            bb = Integer.parseInt(b);
        }
        return aa + bb + "";
    }
}
