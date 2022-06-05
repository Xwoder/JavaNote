package com.xwoder.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("张三丰", "张三", "张真人", "张飞", "张无忌", "赵无忌", "哈利波特"));

        arrayList
                .stream() /* 创建流对象 */
                .filter(name -> name.startsWith("张")) /* 过滤方法 */
                .filter(name -> name.length() == 3)/* 过滤方法 */
                .forEach(System.out::println);

        /*
         * 匿名类方式
         */
        arrayList
                .stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张");
                    }
                })
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() == 3;
                    }
                })
                .forEach(System.out::println);

        /*
         * Lambda 方式
         * */
        arrayList
                .stream()
                .filter((String s) -> {
                    return s.startsWith("张");
                })
                .filter((String s) -> {
                    return s.length() == 3;
                })
                .forEach(System.out::println);

        arrayList
                .stream()
                .filter((String s) -> s.startsWith("张"))
                .filter((String s) -> s.length() == 3)
                .forEach(System.out::println);

    }
}
