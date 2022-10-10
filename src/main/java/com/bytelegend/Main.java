package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) 
    {
        int x = 0, y = 0;
        if (a != null)
            x = Integer.parseInt(a);
        if (b != null)
            y = Integer.parseInt(b);
        return x + y;
    }
}
