package com.careerit.cj.day29;

import lombok.*;

import java.util.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    @Override
    public int compareTo(Employee o) {
        int res = Double.compare(o.salary,this.salary);
        if(res == 0){
            res = this.name.compareTo(o.name);
        }
        return res;
    }
}

class EmpSortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getSalary(),o1.getSalary());
    }
}
class EmpSortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class EmployeeManager {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Krish", 1100));
        empList.add(new Employee("Krish", 1200));
        empList.add(new Employee("Charan", 1300));
        empList.add(new Employee("Tanvi", 5000));
        Collections.sort(empList,Comparator.comparing(Employee::getName).reversed());
        System.out.println(empList);

        String[] arr = {"Krish","Manoj","Charan","Tanvi","Anil"};
        List<String> names = Arrays.asList(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
