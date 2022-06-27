package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a == null) {
            return (String) (0 + (int) b);
        }else if (b == null) {
            return (String) ((int) a + 0);
        }else if (a == null && b == null) {
            return (String) 0;
        }
        sum = (int) a + (int) b;
        return (String) sum;
    }
}
