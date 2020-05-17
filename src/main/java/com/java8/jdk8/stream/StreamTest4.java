package com.java8.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author chenbo
 * @date 2020/5/17 11:56
 */
public class StreamTest4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);
        // limit(6).distinct()颠倒位置则是死循环  因为iterate一直在迭代
        IntStream.iterate(0, item -> (item + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
