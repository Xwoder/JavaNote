package com.xwoder.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamDemo4 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of(
                "张三丰",
                "张三",
                "张真人",
                "张飞",
                "张无忌",
                "赵无忌",
                "哈利波特"));

        arrayList.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        arrayList.stream().forEach((String s) -> {
            System.out.println(s);
        });

        arrayList.stream().forEach(s -> System.out.println(s));


    }
}
