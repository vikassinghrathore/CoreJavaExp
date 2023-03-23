package findfirstorfindany;

import java.util.stream.Stream;

public class FindAny {
    public static void main(String[] args) {
        //sequential stream
        Stream.of("one", "two", "Three", "Four")
                .findAny()
                .ifPresent(System.out::println);
        //parllel stream
        Stream.of("one", "two", "Three", "Four")
                .parallel()
                .findAny()
                .ifPresent(System.out::println);
    }//One,Three
}

