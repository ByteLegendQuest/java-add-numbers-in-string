package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int i1 = 0;
        int i2 = 0;
        if(a != null){
            i1 = Integer.parseInt(a);
        }
        if(b != null){
            i2 = Integer.parseInt(b);
        }
        
        int i = i1 + i2;
        return String.valueOf(i);
    }
}
