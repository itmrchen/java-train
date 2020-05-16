package com.java8.jdk8.stream;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author chenbo
 * @date 2020/5/13 21:05
 */
public class StreamTest {

    public static void main(String[] args) {

        // Stream创建
        Stream stream = Stream.of("hello", "world", "hello world");

        String[] myArray = new String[]{"hello", "world", "hello world"};
        Stream stream1 = Stream.of(myArray);
        Stream stream2 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream3 = list.stream();
        System.out.println("------------------");
        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);
        System.out.println("------------------");
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("------------------");
        IntStream.rangeClosed(3, 8).forEach(System.out::println);


        //list中整型数据 每个都乘以2  求和
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        System.out.println(integerList.stream().map(i -> i * 2).reduce(0, Integer::sum));

        IntStream.of(new int[]{5,6,7}).forEach(System.out::println);

    }
}
