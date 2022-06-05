package com.xwoder.String_;

public class StringChatAt {
    public static void main(String[] args) {
        String s = "你好世界";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }
}
