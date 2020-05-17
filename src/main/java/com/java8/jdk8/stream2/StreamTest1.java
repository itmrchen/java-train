package com.java8.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * @author chenbo
 * @date 2020/5/17 17:03
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 89);
        Student student3 = new Student("wangwu", 99);
        List<Student> list = Arrays.asList(student1, student2, student3);
        List<Student> studentList = list.stream().collect(Collectors.toList());
        studentList.forEach(System.out::println);
        System.out.println("---------------------------------");
        System.out.println("总数：" + list.stream().collect(counting()));
        System.out.println("总数：" + list.stream().count());
    }
}
