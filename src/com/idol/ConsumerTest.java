package com.idol;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/2 18:36
 */
public class ConsumerTest {
    public static void main(String[] args) {

        // 1. 使用Consumer接口实现方法
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        System.out.println("第一种实现...");
        List<String> list1 = Arrays.asList("cxk", "wyb", "ycy");
        list1.forEach(consumer1);

        // 2. 使用lambda表达式，forEach方法需要的就是一个Consumer接口
        System.out.println("第二种实现...");
        List<String> list2 = Arrays.asList("wdl", "hcy", "hmh");
        Consumer<String> consumer2 = (s) -> System.out.println(s); // lambda表达式返回的就是一个Consumer接口
        list2.forEach(consumer2);

        // 3. 使用方法引用，方法引用也是一个Consumer
        System.out.println("第三种实现...");
        List<String> list3 = Arrays.asList("xz", "zy", "yy");
        Consumer consumer3 = System.out::println;
        list3.forEach(consumer3);


        // 猜猜这里会打印什么？
        Consumer<String> consumer10 = (s) -> System.out.println(s);
        Consumer<String> consumer20 = (s) -> System.out.println("嘻嘻2 + " + s);

        consumer10.accept("呵呵1");
        consumer20.andThen(consumer2).accept("呵呵2");
    }
}
