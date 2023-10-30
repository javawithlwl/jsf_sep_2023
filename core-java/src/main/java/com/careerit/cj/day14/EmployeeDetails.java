package com.careerit.cj.day14;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int empno;
    private String ename;
    private double salary;

    public Employee(int empno, String ename, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }
}
public class EmployeeDetails {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(

                new Employee(1001,"Krish",45000),
                new Employee(1002,"Manoj",55000),
                new Employee(1003,"Charan",65000),
                new Employee(1004,"Manish",75000),
                new Employee(1005,"Tanvi",85000),
                new Employee(1006,"Sai",95000),
                new Employee(1007,"Manohar",105000),
                new Employee(1008,"Chandu",115000),
                new Employee(1009,"Superman",125000)

                );
        // Get all the employee id whose salary is greater than or equal to 75000 => 1005,1006,1007,1008,1009

        String empIds = getEmployeeIdsSalaryGte(employeeList,75000);
        System.out.println(empIds);
    }
    private static String getEmployeeIdsSalaryGte(List<Employee> employeeList,double salary){
            List<String> empIds = new ArrayList<>();
            for(Employee emp:employeeList){
                if(emp.getSalary() >= salary){
                    empIds.add(""+emp.getEmpno());
                }
            }
           return String.join(",",empIds);
    }
}
