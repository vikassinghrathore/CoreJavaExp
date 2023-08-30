package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class SortingMultipleAttribute {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("George", 10, 10000),
                new Employee1("Robert", 12, 15000),
                new Employee1("Kathy", 24, 25000)
        );
        List<Employee1> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee1::getName)).collect(Collectors.toList());
       // employees.sort((Employee1 e1, Employee1 e2) -> e1.getName().compareTo(e2.getName()));
        //Collections.sort(employees, Comparator.comparing(Employee1::getName));
       // employees.sort(Comparator.comparing(Employee1::getName).thenComparing(Employee1::getAge));
       // employees.stream().sorted().collect(Collectors.toList());
       /* List<String> alphabets = Arrays.asList("E", "A", "G", "P", "L");
        List<String> sortedAlphabets = alphabets.stream().sorted().collect(Collectors.toList());
        sortedAlphabets.forEach(item->System.out.println(item));

        List<String> alphabetsNew = Arrays.asList("E", "A", "G", "P", "L");
        List<String> reverseSortedAlphabets = alphabets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseSortedAlphabets.forEach(item->System.out.println(item));
*/
        sortedEmployees.forEach(System.out::println);
    }
}
