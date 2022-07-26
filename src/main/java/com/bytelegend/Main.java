package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int a1 = Stoi(a);
        int b1 = Stoi(b);
        return String.valueOf(a1 + b1);
    }

    public static int Stoi(String a) {
        if (a == null) {
            return 0;
        }
        return Integer.parseInt(a);
    }
}
