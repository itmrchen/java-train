package com.java8.jdk8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chenbo
 * @date 2020/5/17 0:07
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world", "test");
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------------------------------");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        list1.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------------------------------");
        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5));
        listStream.flatMap(thelist -> thelist.stream()).map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------------------------------");
        Stream<String> stringStream = Stream.generate(UUID.randomUUID()::toString);
        stringStream.findFirst().ifPresent(System.out::println);
        System.out.println("-----------------必须加limit(6) 否则一直迭代下去 --------------------");
        Stream.iterate(1,item->item+2).limit(6).forEach(System.out::println);
    }
}
