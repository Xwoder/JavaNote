package com.xwoder.String_;

public class StringDemo2 {
    public static void main(String[] args) {
        char[] charArray = new char[]{'a', 'b', 'c'};
        String s1 = new String(charArray);
        String s2 = new String(charArray);

        // true，内容相同
        System.out.println(s1.equals(s2));
        // false，地址不同
        System.out.println(s1 == s2);

        String s3 ="abc";
        String s4 ="abc";

        // true，内容相同
        System.out.println(s3.equals(s4));
        // true，地址相同
        System.out.println(s3 == s4);
    }
}
