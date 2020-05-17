package com.java8.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenbo
 * @date 2020/5/17 13:52
 */
public class StreamTest6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        //list.stream().mapToInt(item -> item.length()).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
        list.stream().mapToInt(item -> {
            int legth = item.length();
            System.out.println(item);
            return legth;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        // 单词去重输出
        List<String> stringList = Arrays.asList("hello world", "hello welcome", "hello world welcome");
        List<String> result = stringList.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
