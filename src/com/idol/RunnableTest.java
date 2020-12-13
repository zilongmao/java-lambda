package com.idol;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/2 22:08
 */
public class RunnableTest {

    public static void main(String[] args) throws InterruptedException {
        runnableJava7();
        runnableJava8();

        // 在lambda中使用Runnable
        List<Person> list =  Arrays.asList(new Person(18, 1000D, "Santino"),
                new Person(19, 2000D, "Cxk"));
        Runnable r1 = () -> list.forEach(System.out::println);
        new Thread(r1).start();
//        Thread.sleep(1000L);

        // 组合Consumer
        Runnable r2 = () -> {
            Consumer<Person> style = (person) -> System.out.println(person);
            list.forEach(style);
        };
        new Thread(r2).start();


        // 在lambda中使用Executor
        ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable r3 = () -> list.forEach(System.out::println);
        service.execute(r3);
        Runnable r4 = () -> {
            Consumer<Person> style = (person) -> System.out.println(person);
            list.forEach(style);
        };
        service.execute(r4);
    }

    // Java8之前，Runnable的实例创建
    public static void runnableJava7() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World! - 7");
            }
        };
        new Thread(r).start();
    }

    // Java8，Runnable的实例创建
    public static void runnableJava8() {
        Runnable r = () -> System.out.println("Hello World! - 8");
        new Thread(r).start();
    }
}
