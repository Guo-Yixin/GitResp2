package com.msb;

/**
 * @Author:clumsypsc
 * @Date:4/24/2026-10:39 PM
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private String stuid;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public Student() {
    }

    public Student(String name, int age, String gender, String stuid) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
