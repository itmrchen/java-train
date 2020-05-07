package com.java8.jdk8.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author chenbo
 * @date 2020/5/7 20:53
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan", "lisi", "wangwu");
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);*/
        System.out.println("-------------java8实现排序-------------");
        /*Collections.sort(list,(String o1,String o2)->{
            return o2.compareTo(o1);
        });*/
        Collections.sort(list, (o1, o2) ->
                o2.compareTo(o1)
        );
        System.out.println(list);
    }
}
