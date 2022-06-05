package com.xwoder.String_;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(123).append(new char[]{'a', 'b', 'c'});
        System.out.println(sb);
    }
}
