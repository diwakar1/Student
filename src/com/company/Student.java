package com.company;

public class Student {
    private String stuName;
    private int age;

    public Student(String stuName, int age) {
        this.stuName = stuName;
        this.age = age;
    }



    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}