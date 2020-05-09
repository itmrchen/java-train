package com.java8.jdk8.function;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author chenbo
 * @date 2020/5/10 1:45
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        predicateTest2.filterValue(list, num -> num % 2 == 0);
        System.out.println("--------------------------");
        predicateTest2.filterValue(list, num -> num % 2 != 0);
        System.out.println("--------------------------");
        predicateTest2.filterValue(list, num -> num > 5);
        System.out.println("--------------------------");
        predicateTest2.filterValue(list, num -> true);
        System.out.println("-------------找出大于5的偶数-------------");
        predicateTest2.conditionFilter(list, num -> num % 2 == 0, num -> num > 5);
        System.out.println("--------------------------");
        System.out.println(predicateTest2.judge(new Date()).test(new Date()));
    }

    /**
     * 打印满足条件的数值
     *
     * @param list
     * @param predicate
     */
    public void filterValue(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    /**
     * 且关系
     *
     * @param list
     * @param predicate
     * @param otherPredicate
     */
    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> otherPredicate) {
        for (Integer integer : list) {
            if (predicate.and(otherPredicate).test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public Predicate<Date> judge(Object object) {
        return Predicate.isEqual(object);
    }
}
