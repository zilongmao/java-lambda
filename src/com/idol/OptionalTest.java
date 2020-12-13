package com.idol;

import java.util.Optional;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/1 16:03
 */
public class OptionalTest {
    public static void main(String args[]){

        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable (允许传递为 null 参数)
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of (如果传递的参数是 null，抛出异常 NullPointerException)
        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a, b));
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在
        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        // Optional.get (获取值，值需要存在，否则抛出NoSuchElementException)
        Integer value2 = b.get();
        return value1 + value2;
    }
}