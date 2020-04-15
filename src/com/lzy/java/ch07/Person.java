package com.lzy.java.ch07;

/**
 * @Author mbh
 * @Date 2020/4/15
 * @Desc class person
 */
public class Person {
    // Name of a person
    private String name;
    // Sex of a person
    private String sex;
    // Age of a person
    private Integer age;


    public Person() {
    }

    public Person(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * Say hello to others
     */
    public void sayHello() {
        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
