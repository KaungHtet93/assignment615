package com.pearl.training.collectiontest;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Set<SetEmployee> employeeSet = new HashSet<>();

        employeeSet.add(new SetEmployee("S001", "Alice"));
        employeeSet.add(new SetEmployee("S002", "Bob"));
        employeeSet.add(new SetEmployee("S003", "Charlie"));
        employeeSet.add(new SetEmployee("S001", "Alice")); // Duplicate ID

        System.out.println("All Students in Set:");
        for (SetEmployee s : employeeSet) {
            System.out.println(s);
        }

        // Check if a student exists
        boolean exists = employeeSet.contains(new SetEmployee("S002", "Bob"));
        System.out.println("Bob exists? " + exists); // true

        // Remove a student
        employeeSet.remove(new SetEmployee("S003", "Charlie"));
    }

}
