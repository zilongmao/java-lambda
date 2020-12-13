package com.idol;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/1 16:44
 */
public class Person {

    /** 年龄 */
    private Integer age;

    /** 薪水 */
    private Double salary;

    /** 姓名 */
    private String name;

    public Person() {
    }

    public Person(Integer age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
