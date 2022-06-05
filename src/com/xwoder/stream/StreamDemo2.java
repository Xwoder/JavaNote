package com.xwoder.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        HashMap<String, Integer> personMap = new HashMap<>();
        personMap.put("张三丰", 21);
        personMap.put("张三", 22);
        personMap.put("张真人", 23);
        personMap.put("张飞", 24);
        personMap.put("张无忌", 25);
        personMap.put("赵无忌", 26);

        personMap.keySet()
                .stream().forEach(System.out::println);

        personMap.entrySet()
                .stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));

        int array[] = {1, 2, 3, 4, 5};
        Arrays.stream(array).forEach(System.out::println);

        Stream.of(10, 20, 30, 40, 50).forEach(System.out::println);
    }
}
