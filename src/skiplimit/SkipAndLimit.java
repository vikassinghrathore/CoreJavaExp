package skiplimit;

import java.util.stream.Stream;

public class SkipAndLimit {
    public static void main(String[] args) {
        // skip & limit together
                 Stream
                .iterate(1, i -> i + 2) // generate Stream
                .skip(5) // skip 5 elements
                .limit(10) // limit to 10 elements
                .forEach(num -> System.out.print(" " + num)); // print
    }
}

