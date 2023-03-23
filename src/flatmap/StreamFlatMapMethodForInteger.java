package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapMethodForInteger {
    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 2, 3);
        List<Integer> second = Arrays.asList(2, 3, 4);
        List<Integer> third = Arrays.asList(4, 5, 6);

        List<List<Integer>> numList = Arrays.asList(first, second, third);
        System.out.println("List Before Flattenning :\n\n" + numList);

        List<Integer> resList = numList.
                stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("\n\n2 Meging List of List into SingleList :-" + resList);

    }
}
