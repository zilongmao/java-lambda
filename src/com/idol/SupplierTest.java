package com.idol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/1 16:43
 */
public class SupplierTest {

    public static void main(String[] args) {

        // 第一种方式
        Supplier<Person> supplierPerson1 = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person(10, 2000D, "牛逼"); // 这里也可以使用无参构造函数
            }
        };
        System.out.println("第一种方式： " + supplierPerson1.get().toString());

        // 第二种方式
        Supplier<Person> supplierPerson2 = () -> new Person(20, 3000D, "狗币"); // 这里也可以使用无参构造函数
        System.out.println("第二种方式： " + supplierPerson2.get().toString());

        // 第三种方式
        Supplier<Person> supplierPerson3 = Person::new; // 这里不能使用有参构造函数了，否则会出现编译异常
        System.out.println("第三种方式： " + supplierPerson3.get().toString());

        // Java7
        for (int i = 0; i < 10 ; i++) {
            System.out.println(new Random().nextInt(10));
        }

        // Java8
        Supplier<Integer> supplierDouble = () -> new Random().nextInt(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(supplierDouble.get());
        }

//        System.out.println(getRandomJava7(10));
//        System.out.println(getRandomJava8(10));

        List<Integer> list = new ArrayList<>();
        int[] intArr = {1,2,3,4,5};

        list.add(1);
        list.add(2);

        list.forEach(integer -> {
//            System.out.println(integer);
        });

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }
    }

    public static Person newPersonJava7() {
        return new Person();
    }

    public static Person newPersonJava8() {
        Supplier<Person> personSupplier = () -> new Person();
        return personSupplier.get();
    }

    public static Integer getRandomJava7(int bound) {
        return new Random().nextInt(bound);
    }

    public static Integer getRandomJava8(int bound) {
        Supplier<Integer> supplierDouble = () -> new Random().nextInt(bound);
        return supplierDouble.get();
    }
}

