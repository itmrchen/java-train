package com.java8.jdk8.lambda;

/**
 * @author chenbo
 * @date 2020/5/7 16:47
 */
@FunctionalInterface
interface MyInteface {
    /**
     * 测试
     */
    void test();

    /**
     * 重写了java.lang.Object类的方法 不影响函数式接口声明
     *
     * @return
     */
    @Override
    String toString();

}

public class Test2 {

    public void myTest(MyInteface myInteface) {
        System.out.println(1);
        myInteface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        // 传统方式
        /*test2.myTest(new MyInteface() {
            @Override
            public void test() {
                System.out.println("mytest");
            }
        });*/

        // lambda表达式写法
        test2.myTest(() -> {
            System.out.println("mytest");
        });
    }

}
