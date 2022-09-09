package com.bytelegend;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int a1, b1;
        if(a == null) {
            a1 = 0;
        }
        else {
            a1 = Integer.parseInt(a);
        }
        if(b == null){
            b1 = 0;
        }
        else {
            b1 = Integer.parseInt(b);
        }
        return String.valueOf(a1 + b1);

    }
}
