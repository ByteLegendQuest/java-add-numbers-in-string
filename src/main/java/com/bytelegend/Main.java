package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Intger a1 = 0;
        Intger b1 = 0;
        if (a != null) a1 = Intger.valueOf(a);
        if (b != null) b1 = Intger.valueOf(b);
        
        return (a1 + b1).toString();
    }
}
