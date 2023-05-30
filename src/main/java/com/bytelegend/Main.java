package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int sum = 0;
        if(a == null) {
            if(b == null) {
                return 0;
            } else {
                return b;
            }
        } else if(b == null) {
            if(a == null) {
                return 0;
            } else {
                return a;
            }
            
        } else {
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }
    }
}
