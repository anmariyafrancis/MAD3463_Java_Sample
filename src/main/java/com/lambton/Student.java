package com.lambton;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

enum Gender {
    MALE,
    FEMALE,
    OTHERS
}

public class Student {
    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float totalMarks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }

    public void printData() {
        System.out.println("studentID: " + studentId);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("birthDate: " + birthDate);
        System.out.println("studentAge: " + getStudentAge());
        System.out.println("Gender: " + gender);
        System.out.println("totalMarks: " + totalMarks);
    }

    public int getStudentAge(){
        LocalDate today=LocalDate.now();
        int age=today.getYear()-birthDate.getYear();
        return age;

    }
}
