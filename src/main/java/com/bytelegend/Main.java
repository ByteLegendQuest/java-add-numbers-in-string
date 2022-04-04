package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Integer a1 = 0;
        Integer b1 = 0;
        if (a != null) a1 = Integer.valueOf(a);
        if (b != null) b1 = Integer.valueOf(b);
        
        return String.valueOf(a1 + b1);
    }
}
