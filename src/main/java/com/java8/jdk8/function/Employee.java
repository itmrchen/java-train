package com.java8.jdk8.function;

/**
 * @author chenbo
 * @date 2020/5/10 17:54
 */
public class Employee {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                '}';
    }
}
