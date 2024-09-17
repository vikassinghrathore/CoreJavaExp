package java17;

public class SealedClassExample {

        public static void main(String[] args) {
            Person employee = new Employee("Alice");
            Person manager = new Manager("Bob");

            System.out.println("Employee Name: " + employee.name()); // Employee Name: Alice
            System.out.println("Manager Name: " + manager.name());   // Manager Name: Bob
        }
    }

