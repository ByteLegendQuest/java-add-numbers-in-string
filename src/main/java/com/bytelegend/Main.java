package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {

        int aI;
        int bI;

        try {
            aI = Integer.parseInt(a);
        }
        catch (NumberFormatException e) {
            aI = 0;
        }

        try {
            bI = Integer.parseInt(b);
        }
        catch (NumberFormatException e) {
            bI = 0;
        }
        String result = String.valueOf(aI + bI);
        return result;
    }
}
