package com.idol;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/2 20:11
 */
public class FunctionTest {

    public static void main(String[] args) {

        // 1. 将字符串转成Integer
        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length(); // 获取字符串的长度，并且返回
            }
        };
        System.out.println("first test: " + function1.apply("nice啊马飞") + "\n");

        // 2. 将对象转成字符串(toString)
        Function<Person, String> function2 = (p) -> p.toString();
        Person person = new Person(18, 5000D, "牛先生");
        System.out.println("second test: " + function2.apply(person) + "\n");

        // 3. 随机给对象赋值
        List<Person> list = Arrays.asList(new Person(), new Person());
        list.forEach((person1) -> System.out.println("third test before: " + person1));
        System.out.println();
        Function<Person, Person> function3 = new Function<Person, Person>() {
            @Override
            public Person apply(Person person) {
                person.setAge(new Random().nextInt(30));
                person.setSalary(Double.valueOf(new Random().nextInt(8000)));
                person.setName("");
                return person;
            }
        };
        list.forEach(person1 -> System.out.println("third test after: " + function3.apply(person1).toString()));
    }
}
