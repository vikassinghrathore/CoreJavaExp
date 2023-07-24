package sorting;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class EmployeeList {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Sneha", 33, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(123, "Gautam", 26, "Male", "Sales & Marketing", 2015, 13500.0));



            //sorting on name,age,dept
           // Collections.sort(employeeList, Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge));

           // final Function<Employee, Integer> byAge = emplist -> emplist.getAge();
            //final Function<Employee, String> byTheirName = emplist -> emplist.getName();
            List<Employee> sortedlist =   employeeList.stream()
                                                      .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                                                      .collect(Collectors.toList());
        System.out.println("Sorted in ascending order by age and name: ");
        sortedlist.forEach(System.out::println);
    }
    }



