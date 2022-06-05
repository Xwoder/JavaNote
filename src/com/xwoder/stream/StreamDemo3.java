package com.xwoder.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of(
                "张三丰",
                "张三",
                "张真人",
                "张飞",
                "张无忌",
                "赵无忌",
                "哈利波特"));

        /*
         * limit 方法
         * */
        arrayList
                .stream()
                .limit(3)
                .forEach(System.out::println);

        /*
         * skip 方法
         * */
        arrayList
                .stream()
                .skip(3)
                .limit(2)
                .forEach(System.out::println);


        /*
         * concat 方法
         * */
        ArrayList<Integer> firstArrayList = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> secondArrayList = new ArrayList<>(List.of(10, 20, 30));
        Stream.concat(firstArrayList.stream(), secondArrayList.stream()).forEach(System.out::println);


        ArrayList<Integer> duplicateArrayList = new ArrayList<>(List.of(1, 1, 2, 2, 3, 3, 1, 2, 3));
        duplicateArrayList
                .stream()
                .distinct()
                .forEach(System.out::println);
    }
}
