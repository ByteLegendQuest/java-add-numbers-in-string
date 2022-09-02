package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        Integer a1;
        Integer b1;
        String as = a;
        String bs = b;
        if (as == null) {
            as = "0";
        }
        if (bs == null) {
            bs = "0";
        }
        a1 = Integer.parseInt(as);
        b1 = Integer.parseInt(bs);
        return String.valueOf(a1 + b1);
    }
}
