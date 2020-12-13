package com.idol;

import java.util.Arrays;
import java.util.Comparator;

/**
 * TODO: 19942
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/3 15:47
 */
public class test {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
//        for (int j = 0; j < 100000000; j++) {
//            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//            int length = arr.length;
//            for (int i = 0; i < length; i++) {
//                int iRandNum = (int) (Math.random() * length);
//                int temp = arr[iRandNum];
//                arr[iRandNum] = arr[i];
//                arr[i] = temp;
//            }
//        }
        for (int j = 0; j < 100000000; j++) {
            Integer[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            Comparator cmp = new MyComparator();
            Arrays.sort(arr, cmp);
        }
        System.out.println("随机完成，共消耗 " + (System.currentTimeMillis() - startTime) + " 毫秒");
        // 输出
//        for (int i = 0; i < length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Math.random() < 0.5 ? 1 : -1;
    }
}