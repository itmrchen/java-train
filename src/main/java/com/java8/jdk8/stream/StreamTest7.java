package com.java8.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenbo
 * @date 2020/5/17 15:02
 */
public class StreamTest7 {
    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("hello", "hi", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");
        List<String> list = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + "" + item2)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
