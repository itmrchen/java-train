package com.java8.jdk8.methodreference;

import com.sun.deploy.ui.DialogTemplate;
import com.sun.prism.shader.AlphaOne_Color_Loader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author chenbo
 * @date 2020/5/12 1:30
 */
public class MethodReferenceTest {
    public String getString(Supplier<String> stringSupplier) {
        return stringSupplier.get() + "hello";
    }

    public String getString2(String string, Function<String, String> function) {
        return function.apply(string);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 12);
        Student student2 = new Student("lisi", 45);
        Student student3 = new Student("wangwu", 21);
        List<Student> studentList = Arrays.asList(student1, student2, student3);
/*        studentList.sort((s1, s2) -> Student.compareByScore(s1, s2));
        studentList.forEach(item -> System.out.println(item.getScore()));*/

        //静态方法引用 类名：：静态方法
        /*studentList.sort(Student::compareByScore);
        studentList.forEach(item -> System.out.println(item.getScore()));

        studentList.sort(Student::compareByName);
        studentList.forEach(a -> System.out.println(a.getName()));*/

        // 实例方法引用 对象名：：实例方法
        /*StudentComparator comparator = new StudentComparator();
        studentList.sort(comparator::compareByScore);
        studentList.forEach(item -> System.out.println(item.getScore()));

        studentList.sort(comparator::compareByName);
        studentList.forEach(item -> System.out.println(item.getName()));*/

        // 类名：：实例方法名
        studentList.sort(Student::compareByStudentScore);
        studentList.forEach(item -> System.out.println(item.getScore()));

        List<String> cities = Arrays.asList("beijing", "shanghai", "guangzhou");
        //Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
        //cities.forEach(item-> System.out.println(item));
        Collections.sort(cities, String::compareToIgnoreCase);
        cities.forEach(item -> System.out.println(item));

        // 构造方法引用

        MethodReferenceTest test =new MethodReferenceTest();
        System.out.println(test.getString(String::new));
        System.out.println(test.getString2("world",String::new));

    }
}
