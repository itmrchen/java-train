package com.java8.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author chenbo
 * @date 2020/5/19 0:58
 */
public class ComparatorTets {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");
        //Collections.sort(list);
        //按长度降序
        //Collections.sort(list,(item1,item2)->item2.length()-item1.length());
        //Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        // 无法类型推断参数 要显示指定 如果去掉.reversed()就可以自动推断出来
        //Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
        //list.sort(Comparator.comparing(String::length).reversed());
        //两级排序 先按长度 再按ascii忽略大小写排序
        //Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
        //Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((item1, item2) -> item1.compareToIgnoreCase(item2)));
        //Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));
        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));
        System.out.println(list);
    }
}
