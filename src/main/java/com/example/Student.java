package com.example;

public class Student {

    private int id;
    private String studentName;

//    USING CONSTRUCTOR

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }


//    USING SETTER
//    public void setId(int id) {
//        this.id = id;
//        System.out.println("Setter Method called : "+" :setId");
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//        System.out.println("Setter Method called : "+" :setName");
//    }

    public void displayStudentInfo(){
        System.out.println("Student Name is : "+studentName+" the ID is : "+id);
    }
}
