package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result += Integer.parseInt(a.charAt(i)) + Integer.parseInt(b.charAt(i));
        }
        return result;
    }
}
