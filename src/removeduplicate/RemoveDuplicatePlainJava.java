package removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatePlainJava {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = Arrays.asList(0, 1, 2, 3, 0, 0, 4, 4, 4);
        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
        System.out.println("ArrayList without duplicates: " + listWithoutDuplicates); //[0, 1, 2, 3, 4]
        System.out.println("ArrayList with duplicates: " + listWithDuplicates);//[0, 1, 2, 3, 0, 0, 4, 4, 4]
    }//LinkedHashSet also remove duplicate
}
