package com.xwoder.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo5 {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);

        System.out.println(arrayList);

        final List<Integer> list = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(list);

        final Set<Integer> set = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);


    }
}
