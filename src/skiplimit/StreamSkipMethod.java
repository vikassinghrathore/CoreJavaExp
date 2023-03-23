package skiplimit;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSkipMethod {
    public static void main(String[] args) {
       // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // System.out.println("List of Integer " + "after skip first 2numbers :\n");
        // numbers.stream().skip(2).forEach(System.out::println);
        //}

        System.out.println("List of integer after " + "skipping first 2 EVEN numbers :- \n");
        // skip first 2 numbers and print remaining
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);
    }
}