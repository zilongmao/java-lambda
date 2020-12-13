package com.idol;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/2 19:57
 */
public class PredicateTest {

    public static void main(String[] args) {

        // 1. 使用Predicate接口实现方法,有一个test方法，传入一个参数，返回一个bool值
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer > 100){
                    return true;
                }
                return false;
            }

        };
        System.out.println("第一种实现： " + predicate1.test(80));

        // 2. 使用lambda表达式
        Predicate<Integer> predicate2 = (x) -> x > 50;
        System.out.println("第二种实现： " + predicate2.test(80));

        // 3. 在forEach中使用Predicate的test
        Predicate<Integer> predicate3 = (x) -> x > 20;
        List<Integer> list = Arrays.asList(10, 20, 30, 15, 25, 35);
        list.forEach(integer -> {
            // 如果list中的值大于x，则打印嘻嘻，否则打印哈哈
            System.out.println("在forEach中使用： " + (predicate3.test(integer) ? integer + " 嘻嘻" : integer + " 哈哈"));
        });


    }
}
