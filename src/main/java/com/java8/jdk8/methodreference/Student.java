package com.java8.jdk8.methodreference;

/**
 * @author chenbo
 * @date 2020/5/12 1:22
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public static int compareByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByStudentScore(Student student) {
        return this.getScore() - student.getScore();
    }

    public int compareByStudentName(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }
}
