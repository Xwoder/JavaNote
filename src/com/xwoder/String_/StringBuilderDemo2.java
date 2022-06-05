package com.xwoder.String_;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        StringBuilder sb = new StringBuilder();

        sb.append('[');
        if (arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                sb.append(arr[i]).append(", ");
            }
            sb.append(arr[arr.length - 1]);
        }
        sb.append(']');

        String str = sb.toString();
        System.out.println(str);
    }
}
