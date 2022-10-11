package com.bytelegend;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int numberA = Integer.parseInt(Optional.ofNullable(a).orElse("0"));
        int numberB = Integer.parseInt(Optional.ofNullable(b).orElse("0"));
        return "" + (numberA + numberB);
    }
}
