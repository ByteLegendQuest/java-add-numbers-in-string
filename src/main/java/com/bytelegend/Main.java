package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int aa;
        int bb;
        try {
            aa = Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            aa = 0;
        }
        try {
            bb = Integer.parseInt(b);
        } catch (NumberFormatException ex) {
            bb = 0;
        }
        return String.valueOf(aa + bb);
    }
}
