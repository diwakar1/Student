package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.println(" enter your name ");
            String name = input.next();

            System.out.println("enter your age:");
            int age = input.nextInt();


            //
            Student stu = new Student(name, age);
            JavaBoot j = new JavaBoot();

            j.add(stu);
            i++;


            System.out.println(j.print());

        }
    }
}
