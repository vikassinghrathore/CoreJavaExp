package findfirstorfindany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstMethodForIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 1. Sequential - findFirst() from list of integers
        Optional<Integer> result1 = numbers // data-source
                .stream() // get sequential stream
                .findFirst(); // find first
        // 1.1 print Sequential result
        if (result1.isPresent()) {
            Integer firstNum = result1.get();
            System.out.println("1. Sequential findFirst() result is = " + firstNum);
        } else {
            System.out.println("No value is pressnt");
        }
        // 2. Parallel - findFirst() from list of integers
                 numbers //  data-source
                .parallelStream() // get parallel stream
                .findFirst() // find first
                .ifPresent(num -> System.out.println("\n2. Parallel findFirst() result is = " + num)); // print
        // 3. filtering and findFirst()
        Optional<Integer> result3 = numbers // data-source
                .stream() // get sequential stream
                .filter(num -> num % 2 == 0) // filter Even numbers
                .findFirst(); // find first
        // 3.1 print to console
        result3.ifPresent(num -> System.out.println("\n3. filter Even numbers & findFirst() result is = " + num));
    }
}

