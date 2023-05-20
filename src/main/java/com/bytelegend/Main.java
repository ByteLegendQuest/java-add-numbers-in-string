package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String pa, String pb) {
        String result = "";
        String a = pa; // This is stupid
        String b = pb;
        if (a == null) a = "0";
        if (b == null) b = "0";
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            int v1 = i < a.length() ? Integer.parseInt(a.charAt(i)) : 0;
            int v2 = i < b.length() ? Integer.parseInt(b.charAt(i)) : 0;
            result += v1 + v2;
        }
        return result;
    }
}
