package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilteredMethod {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Vikas", 62, "Arts"),
                new Student("Kanchan", 55, "Commerce"),
                new Student("Amit", 73, "Science"),
                new Student("Kanvika", 64, "Arts"));
        // map and filter %
       List<Double> newList = studentList
                .stream() // 1. get stream
                .map(s -> s.getPercentage()) // 2.1 get percentage
                //.map(Student::getPercentage) // 2.1 get percentage
                .filter(p -> p > 60) // 2.2 filter first class student
                .collect(Collectors.toList());
        System.out.println("First class Student percentage : \n");
        newList.forEach(System.out::println);

        // map and distinct
        List<String> newList1 = studentList
                .stream() // 1. get stream
                .map(s -> s.getDepartment()) // 2.1 get departments
                .distinct() // 2.2 get distinct departments
                .collect(Collectors.toList());
        System.out.println("Distinct Student department : \n");
        newList1.forEach(System.out::println);
    }
}