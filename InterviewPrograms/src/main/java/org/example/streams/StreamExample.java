package org.example.streams;



import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee>  employees = Arrays.asList(
                new Employee("Alice", "HR", 48000),
                new Employee("Bob", "IT", 65000),
                new Employee("Carol", "Finance", 52000),
                new Employee("David", "IT", 75000),
                new Employee("Eve", "Finance", 50000),
                new Employee("Frank", "HR", 53000),
                new Employee("Grace", "HR", 60000)
        );

        //Filter Employees with Salary > 50000 and Sort by Salary descending
        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .collect(toList());

        highEarners.forEach(System.out::println);

        //Get Employees Name into a List
        List<String> employeesNames = employees.stream()
                .map(Employee::getName)
                .collect(toList());
        employeesNames.forEach(System.out::println);

        //Employees Group by department:
        Map<String, List<Employee>> employeesGroupByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees Group By Dept:" + employeesGroupByDept);

        //Get Employees total salary
        int totalSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Total Salary:" +totalSalary);

        //Group by Department and Sort by Salary Descending and Top two earners per department
        int topN = 2;
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(), list -> list.stream()
                                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                                .limit(topN)
                                .collect(Collectors.toList())
                )));
        grouped.forEach((dept, empList) -> {
            System.out.println("Department :" + dept);
            empList.forEach(System.out::println);
        });

        //Count employees per department:
        Map<String, Long> employeesCount = employees.stream()
                .collect(Collectors.groupingBy(
                        e->e.department,
                        Collectors.counting()
                ));
        System.out.println("Count of Employees by Department :" + employeesCount);

        //Get total salary per department:
        Map<String, Integer> salariesByDept =  employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)
                ));
        System.out.println("Employees Total Salaries by Department:" + salariesByDept);

        //Get top salary per department
        Map<String, Optional<Employee>> topSalaryPerDept  = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
                ));
        topSalaryPerDept.forEach((dept, empOptional) ->{
            System.out.println("Department Name:" +dept+ "Top Salary:" +empOptional.get().getSalary());

        });
    }
}
