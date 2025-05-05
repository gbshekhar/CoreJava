package org.example.io;

public class Employee {
    private String name;
    private String email;
    private int age;

    public Employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
}
