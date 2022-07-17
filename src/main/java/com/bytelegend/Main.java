package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        long la = 0;
        long lb = 0;
        try {
            la = Long.parseLong(a);
        } catch (NumberFormatException ignored) {
        }
        try {
            lb = Long.parseLong(b);
        } catch (NumberFormatException ignored) {
        }
        return la + lb + "";
    }
}
