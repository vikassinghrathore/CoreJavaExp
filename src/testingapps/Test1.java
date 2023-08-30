package testingapps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8);
        List<Integer> listWithoutDuplicates = numbersList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List withoutDuplicates :" + listWithoutDuplicates);

        Map<Integer, Long> countDuplicates = numbersList
                .stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
        System.out.println("List Count Duplicates :" + countDuplicates);

    }
}
