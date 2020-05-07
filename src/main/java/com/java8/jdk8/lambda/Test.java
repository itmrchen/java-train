package com.java8.jdk8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author chenbo
 * @date 2020/5/7 1:55
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        /*list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/

        list.forEach(integer -> System.out.println(integer * 2));
        //方法引用
        list.forEach(System.out::println);

        new Thread(() -> {
            System.out.println("hello");
        }).start();


        // 遍历list
        List<String> listStr = Arrays.asList("hello","world","hello world");
        /*listStr.forEach(item->{
            System.out.println(item.toUpperCase());
        });*/

        //转大写存入另外list
        List<String> list2 =new ArrayList<>();
        listStr.forEach(item->list2.add(item.toUpperCase()));
        list2.forEach(item -> System.out.println(item));
        //lambda表达式实现
        listStr.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        //方法引用实现
        System.out.println("----------方法引用----------");
        listStr.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
