package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapMethodForString {
    public static void main(String[] args) {
        // 1. create 1st List with 3 String elements
        List<String> firstList = Arrays.asList("Vikas", "Amit", "Kanchan");
        List<String> secondList = Arrays.asList("VP", "Abhi", "Saurabh", "Vikas");
        List<String> thirdList = Arrays.asList("Gautam", "Abhilash", "Prasanth");

        List<List<String>> nameList = Arrays.asList(firstList, secondList, thirdList);
        System.out.println("Before flatMap and flattening :- \n\n" + nameList);
        List<String> resultList = nameList
                .stream()
                .flatMap(list -> list.stream())
                .distinct()
                .sorted(String::compareTo)
                .filter(str -> str.contains("a"))
                .collect(Collectors.toList());
        System.out.println("\n\n2 Merging List of Lists into single List :- \n\n" + resultList);
    }
}
