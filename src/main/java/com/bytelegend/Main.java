package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int numA, numbB;
        if (a == null) {
            numA = 0;
        } else {
            numA = Integer.parseInt(a);
        }
        if (b == null) {
            numbB = 0;
        } else {
            numB = Integer.parseInt(b);
        }
        return String.valueof(numA + numbB);
    }
}
