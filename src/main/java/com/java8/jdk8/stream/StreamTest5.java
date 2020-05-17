package com.java8.jdk8.stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 串行流、并行流
 *
 * @author chenbo
 * @date 2020/5/17 13:26
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(50000000);
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("开始排序");
        long startTime = System.nanoTime();
        list.parallelStream().sorted().count();
        long endTime = System.nanoTime();
        long time = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("耗时：" + time);
    }

}
