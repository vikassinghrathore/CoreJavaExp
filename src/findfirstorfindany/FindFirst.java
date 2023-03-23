package findfirstorfindany;

import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {
        //sequential stream
        Stream.of("one", "two", "Three", "Four", "Five")
                .findFirst()
                .ifPresent(System.out::println);
        //parllel stream
        Stream.of("one", "two", "Three", "Four", "Five")
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);
    }//One,One
}
