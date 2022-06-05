package com.xwoder.Array_;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // 动态初始化数组
        final int length = 10;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }

        System.out.print('[');
        if (array.length > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
        }
        System.out.println(']');

        System.out.println(Arrays.toString(array));
    }
}
