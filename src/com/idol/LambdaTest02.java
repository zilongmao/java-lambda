package com.idol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/1 14:15
 */
public class LambdaTest02 {
    public static void main(String[] args) {
        System.out.println("使用 Java 7 语法: ");
        List<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(3);
        numbers1.add(34);
        numbers1.add(13);
        numbers1.add(8);
        sortUsingJava7(numbers1);
        System.out.println(numbers1);

        System.out.println("使用 Java 8 语法: ");
        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(3);
        numbers2.add(34);
        numbers2.add(13);
        numbers2.add(8);
        sortUsingJava8(numbers2);
        System.out.println(numbers2);
    }

    /** 使用 java 7 排序 */
    private static void sortUsingJava7(List<Integer> names){
        Collections.sort(names, new Comparator<Integer>() {
            @Override
            public int compare(Integer s1, Integer s2) {
                return s1.compareTo(s2);
            }
        });
    }

    /** 使用 java 8 排序 */
    private static void sortUsingJava8(List<Integer> names){
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
