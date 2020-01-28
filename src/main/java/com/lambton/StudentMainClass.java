package com.lambton;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StudentMainClass
{
    public static void  main(String[] arg)
    {
        /*Student[] listOfStudents=new Student[2];

        LocalDate s1BirthDate=LocalDate.of(1996,Month.APRIL,12);
        Student s1=new Student(1, "Anmariya","Francis",s1BirthDate,Gender.FEMALE,85,75,65,80,70);
        /*s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateResult();
        s1.printData();*/

        /*LocalDate s2BirthDate=LocalDate.of(1995,Month.APRIL,6);
        Student s2=new Student(2, "Aldin","Joseph",s2BirthDate,Gender.FEMALE,65,55,46,71,92);
        /*s2.calculateTotalMarks();
        s2.calculatePercentage();
        s2.calculateResult();
        s2.printData();*/

        /*listOfStudents[0]=s1;
        listOfStudents[1]=s2;

        for(Student s:listOfStudents){
            s.calculateTotalMarks();
            s.calculatePercentage();
            s.calculateResult();
            s.printData();
        }*/
        Arithmetic arithmetic=new Arithmetic();
        System.out.println(arithmetic.add(10,20));
    }
}
