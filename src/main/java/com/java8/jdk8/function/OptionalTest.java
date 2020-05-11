package com.java8.jdk8.function;

import java.util.Optional;

/**
 * @author chenbo
 * @date 2020/5/10 17:23
 */
public class OptionalTest {
    public static void main(String[] args) {
        //Optional<String> optional = Optional.of("hello");
        Optional<String> optional = Optional.empty();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        // Optional 官方推荐的写法 上面的不是
        optional.ifPresent(item -> System.out.println(item));
        // 如果里面没有值则 打印默认值
        System.out.println(optional.orElse("默认值"));
        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
