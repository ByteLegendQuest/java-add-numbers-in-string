package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a == null && b == null) {
            a = "0";
            return a;
        } else if (b == null) {
            int n1 = Integer.parseInt(a);
            int n2 = 0;
            int count = n1 + n2;
            return String.valueOf(count);
        } else if (a == null) {
            int n1 = 0;
            int n2 = Integer.parseInt(b);
            int count = n1 + n2;
            return String.valueOf(count);
        }else {
            Integer.parseInt(a);
            Integer.parseInt(b);
            int n1 = Integer.parseInt(a);
            int n2 = Integer.parseInt(b);
            int count = n1 + n2;
            return String.valueOf(count);
        }
    }
}
