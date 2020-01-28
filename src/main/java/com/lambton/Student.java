package com.lambton;

import java.time.LocalDate;

enum Gender {
    MALE,
    FEMALE,
    OTHERS
}

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private float m1;
    private float m2;
    private float m3;
    private float m4;
    private float m5;
    private float totalMarks;
    private float percentage;
    private String result;


    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float m1, float m2, float m3, float m4, float m5) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getM1() {
        return m1;
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public float getM3() {
        return m3;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }

    public float getM4() {
        return m4;
    }

    public void setM4(float m4) {
        this.m4 = m4;
    }

    public float getM5() {
        return m5;
    }

    public void setM5(float m5) {
        this.m5 = m5;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    /*public void setData(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float totalMarks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }*/

    public void printData() {
        System.out.println("studentID: " + studentId);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("birthDate: " + birthDate);
        System.out.println("studentAge: " + getStudentAge());
        System.out.println("Gender: " + gender);
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Subject 4: " + m4);
        System.out.println("Subject 5: " + m5);
        System.out.println("totalMarks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result : " + result+"\n");

    }

    public int getStudentAge(){
        LocalDate today=LocalDate.now();
        int age=today.getYear()-birthDate.getYear();
        return age;

    }

    public void calculateTotalMarks(){
        float total=0;
        total=m1+m2+m3+m4+m5;
        this.totalMarks = total;
    }
    public void calculatePercentage() {
        this.percentage = this.totalMarks / 5;
    }
    public void calculateResult(){
        if(this.percentage>=50){
            this.result="PASS";
        }
        else{
            this.result="FAIL";
        }
    }


}
