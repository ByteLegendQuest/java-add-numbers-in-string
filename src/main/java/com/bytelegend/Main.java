package com.bytelegend;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        return String.valueOf(stringToInt(a) + stringToInt(b));
    }

    private static int stringToInt(String value) {
        return Objects.isNull(value) ? 0 : Integer.parseInt(value);
    }
}
