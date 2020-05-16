package com.java8.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chenbo
 * @date 2020/5/16 2:00
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "hello world");
        //String[] array = stream.toArray(legth->new String[legth]);
        String[] array = stream.toArray(String[]::new);
        Arrays.asList(array).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
        //List<String> list =stream1.collect(Collectors.toList());
        //List<String> list = stream1.collect(()->new ArrayList<String>(),(thelist,item)->thelist.add(item),(list1,list2)->list1.addAll(list2));
        //List<String> list =stream1.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
        // ArrayList::new LinkedList::new更加的灵活  Collectors.toList()只是ArrayList
        //List<String> list = stream1.collect(Collectors.toCollection(ArrayList::new));
        // 字符串拼接
        String string = stream1.collect(Collectors.joining());
        System.out.println(string);
        //list.forEach(System.out::println);


    }

}
