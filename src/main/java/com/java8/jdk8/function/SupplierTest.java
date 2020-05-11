package com.java8.jdk8.function;

import java.util.function.Supplier;

/**
 * @author chenbo
 * @date 2020/5/10 14:56
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student();
        System.out.println(studentSupplier.get().getName());
        System.out.println("---------------------------------");
        Supplier<Student> supplier = Student::new;
        System.out.println(supplier.get().getName());

    }
}
