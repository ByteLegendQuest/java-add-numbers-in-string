package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int aint;
        int bint;
        if (a == null) {
            aint = 0;
        } else {
            aint = Integer.parseInt(a);
        }
        if (b == null) {
            bint = 0;
        } else {
            bint = Integer.parseInt(b);
        }
        return "" + (aint + bint);
    }
}
