package com.lzy.java.ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author mbh
 * @Date 2020/4/15
 * @Desc Class student
 */
public class Student extends Person {
    // School of student
    private String school;
    // Grade of student
    private String grade;
    // Score of all subject
    private Map<String, Double> score;

    public Student() {
    }

    public Student(String name, String sex, Integer age, String school, String grade, Map<String, Double> score) {
        super(name, sex, age);
        this.school = school;
        this.grade = grade;
        this.score = score;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }


    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hi! I am a student, my name is " + getName());
    }

    /**
     * Compute average score of all subject
     *
     * @return Average score
     */
    public Double getAvgScore() {
        return score.values().stream().collect(Collectors.averagingDouble(Double::doubleValue));
    }

    @Override
    public String toString() {
        return super.toString() +
                " || Student{" +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        // Upcasting
        List<Student> students = new ArrayList<>();

        // Set score map of students
        Map<String, Double> score = new HashMap<>();
        score.put("Computer Science", 80.0);
        score.put("Database", 85.0);
        score.put("Operating System", 75.5);

        // Add student to a list
        students.add(new Student("Liming", "M", 21, "LZY", "first grade", score));
        students.add(new Student("Xiaohua", "F", 20, "LZY", "first grade", score));
        students.add(new Student("Zhangtao", "F", 21, "LZY", "first grade", score));
        students.add(new Student("Qiansun", "M", 20, "LZY", "first grade", score));

        // Print information of all students
        students.forEach(s -> System.out.println(s + " avg score = " + s.getAvgScore()));

        // Say hello to others.
        students.get(0).sayHello();
    }
}
