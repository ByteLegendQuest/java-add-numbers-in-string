package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a == null) {
            int valueA = 0;
        } else {
            int valueA = Integer.parseInt(a);
        }
        if (b == null) {
            int valueB = 0;
        } else {
            int valueB = Integer.parseInt(b);
        }

        return String.toString(valueA + valueB);
        
    }
}
