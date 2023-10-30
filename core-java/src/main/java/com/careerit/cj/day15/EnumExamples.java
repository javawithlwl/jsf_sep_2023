package com.careerit.cj.day15;

import com.careerit.cj.day7.Day;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
enum Gender{
    M,F;
}
enum TShirtSize{
    S(38),M(40),L(42),XL(44),XXL(46);
    private int size;
    private TShirtSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
class Employee{
    private int empno;
    private String name;
    private Gender gender;
    private double salary;

    public Employee(int empno, String name, Gender gender, double salary) {
        this.empno = empno;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("empno=").append(empno);
        sb.append(", name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
public class EnumExamples {

    public static void main(String[] args) {

        Employee emp = new Employee(1001,"Rani",Gender.F,50000);

        for(TShirtSize shirtSize:TShirtSize.values()){
            System.out.println(shirtSize+" : "+shirtSize.getSize());
        }
    }

}
