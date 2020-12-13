package com.idol;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/1 16:28
 */
public class LambdaTest04 {

    public static void main(String[] args) {

        TeacherService teacherService = message -> System.out.println(message + " \n老师：你连这个都不会？");

        teacherService.askQuestion("我：老师，求教Lambda。");
    }

}

@FunctionalInterface
interface TeacherService {

    void askQuestion(String message);
}