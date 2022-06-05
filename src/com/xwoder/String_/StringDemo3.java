package com.xwoder.String_;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int digitCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("数字字符有" + digitCount + "个");
    }
}
