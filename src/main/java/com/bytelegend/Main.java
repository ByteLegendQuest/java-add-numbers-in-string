package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int n = 0;
        int m = 0;
        if (a == null){
            if (b == null){
                return "0";
            }
            m = Integer.parseInt(b);
            return String.valueOf(m);
        }

        if (b == null){
            n = Integer.parseInt(a);
            return String.valueOf(n);
        }

        n = Integer.parseInt(a);
        m = Integer.parseInt(b);

        return String.valueOf(n + m);
    }
}
