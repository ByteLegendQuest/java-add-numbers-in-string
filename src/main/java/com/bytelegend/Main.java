package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (a==null) {
            a = "0";
        }else if(b==null){
            b = "0";
        }
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b)
        return "" + (x + y);
    }
}
