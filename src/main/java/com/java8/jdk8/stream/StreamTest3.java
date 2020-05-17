package com.java8.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * @author chenbo
 * @date 2020/5/17 11:14
 */
public class StreamTest3 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
        //取出流中大于2的数据 乘以2，忽略前2个元素，取出前两个元素 求和
        //System.out.println(stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());
        //求出最小值
        //stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).min().ifPresent(System.out::println);
        //同时求出 、最大值、最小值 、和
        IntSummaryStatistics statistics = stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMin());

    }
}
