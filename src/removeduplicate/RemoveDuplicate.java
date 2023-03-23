package removeduplicate;

import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicate {
    public static void main(String[] args) {
        //ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        List<Integer> listWithDuplicates = Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8);
        List<Integer> listWithoutDuplicates = listWithDuplicates
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates); //[1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("ArrayList with duplicates: " + listWithDuplicates);//1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8
    }
}
