package com.lambton;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StudentMainClass
{
    public static void  main(String[] arg)
    {
        Student s1=new Student();
        LocalDate s2=LocalDate.of(1996,Month.APRIL,12);
        s1.setData(1, "Anmariya","Francis",s2,Gender.FEMALE,85);
        s1.printData();
    }
}
