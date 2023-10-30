package com.careerit.cj.day16;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

class Student{
    private long regNo;
    private String name;
    private int std;
    private final static String schoolName = "ABC School";

    public Student(long regNo, String name, int std) {
        this.regNo = regNo;
        this.name = name;
        this.std = std;
    }

    public void showDetails(){
        out.println("RegNo : "+regNo);
        out.println("Name : "+name);
        out.println("Std : "+std);
        out.println("School Name : "+schoolName);
    }

}




public class StaticKeywordUsage {
    static class StaticOne{

    }

    // static class
    // static import
    // static methods
    // static block
    // static variables



    static{
        out.println("Hello from static block 1");
    }
    static{
        out.println("Hello from static block 2");
    }

    public static void main(String[] args) {

        out.println(PI);
        out.println(sqrt(25));
        out.println(pow(2, 3));
        out.println(random());

        GenericUtil.m1();
        GenericUtil.m2();

        Student s1 = new Student(1001,"Krish",5);
        Student s2 = new Student(1002,"Manoj",5);
        Student s3 = new Student(1003,"Charan",5);
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

    }
    static{
        out.println("Hello from static block 4");
    }

    static{
        out.println("Hello from static block 3");
    }



}
