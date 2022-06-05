package com.xwoder.String_;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
