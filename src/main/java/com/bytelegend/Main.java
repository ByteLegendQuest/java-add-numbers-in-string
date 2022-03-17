package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        if (null == a && null != b){
            return Integer.parseInt(b) + "";
        }
        if (null != a && null == b){
            return Integer.parseInt(a) + "";
        }
        if (null == a && null == b){
            return 0 + "";
        }
        if (null != a && null != b){
            return (Integer.parseInt(a) + Integer.parseInt(b)) + "";
        }
        return null;
    }
}
