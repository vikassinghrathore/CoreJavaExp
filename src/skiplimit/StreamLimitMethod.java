package skiplimit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimitMethod {
    public static void main(String[] args) {
        // list of integer numbers
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("List of integer after " + "limiting to first 5 numbers :- \n");
        // limit first 5 numbers and print to console
        numbers.stream().limit(5).forEach(System.out::println);
    }*/
        System.out.println("List of integer after " + "limiting to first 5 EVEN numbers :- \n");

        // skip first 2 numbers and print remaining
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
                .filter(i -> i % 2 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}

