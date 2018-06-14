package com.company;

import java.util.ArrayList;

public class JavaBoot {

    ArrayList<Student>student;

    public JavaBoot() {
        student = new ArrayList<Student>();
    }

    public void add ( Student st){

        this.student.add(st);

    }
    public String print(){
        String print="";
        for(Student s: student){
            print += s.getStuName() +" "+s.getAge()+"\n";
        }
        return print;
    }

}
