package com.java8.jdk8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author chenbo
 * @date 2020/5/9 1:30
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 13);
        Person person2 = new Person("lisi", 17);
        Person person3 = new Person("wangwu", 18);
        List<Person> personList = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();
        /*List<Person> personResult = personTest.getPersonsByUsername("zhangsan", personList);
        personResult.forEach(person -> System.out.println(person.toString()));*/

        List<Person> personResult = personTest.getPersonsByAge(14, personList);
        personResult.forEach(person -> System.out.println(person.toString()));

    }

    public List<Person> getPersonsByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonsByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, persons) ->
             persons.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        return biFunction.apply(age, personList);
    }
}
