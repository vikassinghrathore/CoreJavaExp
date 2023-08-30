package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());//sort()-natural sorting order
        List<Integer> sortedList1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //Comparator.reverseOrder()-
        List<Integer> sortedList2 = list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList()); //Lambda expresssion-reversse

        System.out.println(sortedList);System.out.println(sortedList1);System.out.println(sortedList2);

    }
}
