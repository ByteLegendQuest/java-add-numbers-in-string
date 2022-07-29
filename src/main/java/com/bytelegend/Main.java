package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int aa = a == null ? 0 : Integer.parseInt(a);
        int bb = b == null ? 0 : Integer.parseInt(b);
        int sum = (aa % 10) + (bb % 10) + (aa / 10 % 10) * 10 + (bb / 10 % 10) * 10 + aa / 100 * 100 + bb / 100 * 100;
        return String.valueOf(sum);
    }
}
