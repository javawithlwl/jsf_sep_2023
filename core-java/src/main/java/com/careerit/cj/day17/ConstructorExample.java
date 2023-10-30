package com.careerit.cj.day17;

// Constructor is a special method which is used to create an object and initialize the object state
// Constructor name should be same as class name
// Constructor should not have any return type
// Constructor can have any number of arguments
// Constructor can be overloaded
// Constructor can be private, public, protected, default
// If we don't define any constructor then compiler will add default constructor
// If we define any constructor then compiler will not add default constructor

class Student {

    int rollNo;
    String name;
    String email;
    String mobile;

    public Student(int rollNo, String name, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
    }

    public Student(int rollNo, String name, String email,String mobile) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }



    // Different parameter list indicates 3 things:
    // 1. Number of arguments
    // 2. Order of the arguments
    // 3. Type of the arguments



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("rollNo=").append(rollNo);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

public class ConstructorExample {

    public static void main(String[] args) {
        Student s1 = new Student(1001, "Krish", "krish.t@gmail.com");
        Student s2 = new Student(1002, "Manoj", "manoj.pvn@gmail.com");
        Student s3 = new Student(1003, "Charan", "charan.k@gmail.com");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
