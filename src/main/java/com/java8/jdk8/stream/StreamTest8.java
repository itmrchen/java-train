package com.java8.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分组、分区【只分两个 一个ture的组 一个false的组】
 *
 * @author chenbo
 * @date 2020/5/17 15:28
 */
public class StreamTest8 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 99, 16);
        Student student2 = new Student("lisi", 88, 14);
        Student student3 = new Student("wangwu", 91, 17);
        Student student4 = new Student("zhangsan", 90, 18);
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
        //Map<String, List<Student>> map = studentList.stream().collect(Collectors.groupingBy(Student::getName));
        //求每组总数
        //Map<String, Long> map = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
        //分组求平均分
        //Map<String, Double> map = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));
        //分区 是否大于90
        Map<Boolean, List<Student>> map = studentList.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 90));

        System.out.println(map);
    }
}
