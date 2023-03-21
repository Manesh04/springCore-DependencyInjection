package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = context.getBean("student", Student.class);
        student.displayStudentInfo();
//        Student manish = context.getBean("student", Student.class);
//        manish.displayStudentInfo();
//
//        Student vaibhav = context.getBean("vaibhav", Student.class);
//        vaibhav.displayStudentInfo();

//        Student manish1 = new Student(4, "Manish");
//        manish1.displayStudentInfo();

//        Student student = new Student();
//        student.setStudentName("Manish T");
//        student.displayStudentInfo();
    }
}
