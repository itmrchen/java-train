package com.java8.jdk8.methodreference;

import com.sun.deploy.ui.DialogTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenbo
 * @date 2020/5/12 1:30
 */
public class MethodReferenceTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 12);
        Student student2 = new Student("lisi", 45);
        Student student3 = new Student("wangwu", 21);
        List<Student> studentList = Arrays.asList(student1, student2, student3);
/*        studentList.sort((s1, s2) -> Student.compareByScore(s1, s2));
        studentList.forEach(item -> System.out.println(item.getScore()));*/

        //静态方法引用
        /*studentList.sort(Student::compareByScore);
        studentList.forEach(item -> System.out.println(item.getScore()));

        studentList.sort(Student::compareByName);
        studentList.forEach(a -> System.out.println(a.getName()));*/

        // 实例方法引用
        StudentComparator comparator = new StudentComparator();
        studentList.sort(comparator::compareByScore);
        studentList.forEach(item -> System.out.println(item.getScore()));

        studentList.sort(comparator::compareByName);
        studentList.forEach(item -> System.out.println(item.getName()));
    }
}
