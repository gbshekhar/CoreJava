package org.example.io;

public class EmployeeValidator {
    public static boolean isValid(String line) {
        return line != null && line.split(",").length == 3;
    }

    public static Employee parse(String line) {
        String[] parts = line.split(",");
        return new Employee(parts[0], parts[1], Integer.parseInt(parts[2]));
    }
}
