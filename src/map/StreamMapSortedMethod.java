package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamMapSortedMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vikas");
        names.add("Amit");
        names.add("Kanchan");
        List<String> sortAndConvertUpperCaseMap = names
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("To Sort and Uppercase names : \n");
        sortAndConvertUpperCaseMap.forEach(System.out::println);
    }
}
