package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int aValue = 0;
        int bValue = 0;
        if (a != null) aValue = Integer.parseInt(a);
        if (b != null) bValue = Integer.parseInt(b);
        return String.valueOf(aValue + bValue);
    }
}
