package com.java8.jdk8.methodreference;

/**
 * @author chenbo
 * @date 2020/5/12 1:43
 */
public class StudentComparator {
    public int compareByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
