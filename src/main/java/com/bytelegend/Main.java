package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (checkForNull(a)) {
            a = "0";
        }
        if (checkForNull(b)) {
            b = "0";
        }
        int addedValue = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(addedValue);
    }

    public static boolean checkForNull(String a) {
        return a == null;
    }
}
