package com.xwoder.String_;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] charArray = new char[]{'a', 'b', 'c'};
        String s2 = new String(charArray);
        System.out.println(s2);

        byte[] byteArray = new byte[]{97, 98, 99};
        String s3 = new String(byteArray);
        System.out.println(s3);

        String s4 = new String("abc");
        System.out.println(s4);
    }
}
