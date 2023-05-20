package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        String result = "";
        if (a == null) a = "0";
        if (b == null) b = "0";
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            int v1 = a != null && i < a.length() : Integer.parseInt(a.charAt(i));
            int v2 = b != null && i < b.length() : Integer.parseInt(b.charAt(i));
            result += v1 + v2;
        }
        return result;
    }
}
