package com.java8.jdk8.stream2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author chenbo
 * @date 2020/5/17 17:03
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 99);
        Student student3 = new Student("wangwu", 99);
        Student student4 = new Student("wangwu", 99);
        List<Student> list = Arrays.asList(student1, student2, student3, student4);
        List<Student> studentList = list.stream().collect(Collectors.toList());
        studentList.forEach(System.out::println);
        System.out.println("---------------------------------");
        System.out.println("总数：" + list.stream().collect(counting()));
        System.out.println("总数：" + list.stream().count());

        studentList.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println(studentList.stream().collect(averagingInt(Student::getScore)));
        IntSummaryStatistics intSummaryStatistics = studentList.stream().collect(summarizingInt(Student::getScore));
        System.out.println("IntSummaryStatistics:" + intSummaryStatistics);

        System.out.println(studentList.stream().map(Student::getName).collect(joining(", ")));
        System.out.println(studentList.stream().map(Student::getName).collect(joining(", ", "pre", "suf")));
        Map<Integer, Map<String, List<Student>>> map = studentList.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(map);
        Map<Boolean, List<Student>> stuMap = studentList.stream().collect(partitioningBy(student -> student.getScore() > 90));
        System.out.println(stuMap);
        Map<Boolean, Map<Boolean, List<Student>>> partMap = studentList.stream().collect(partitioningBy(student -> student.getScore() > 90, partitioningBy(student -> student.getScore() > 91)));
        System.out.println(partMap);
        Map<Boolean, Long> map1 = studentList.stream().collect(partitioningBy(student -> student.getScore() > 90, counting()));
        System.out.println(map1);
        Map<String, Student> map2 = studentList.stream().collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println(map2);
    }
}
