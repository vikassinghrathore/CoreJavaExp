package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamMapMethod {
    public static void main(String[] args) {
        // Integer numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = new ArrayList<>();
        names.add("Vikas");
        names.add("Amit");
        names.add("Kanchan");
        //Square of numbers
        Stream<Integer> stream = numbers
                .stream()
                .map(i -> i * i);
        System.out.println("Square of first 10 natural numbers : \n");
        stream.forEach(System.out::println);
        //Converting String to Upper Case
        Stream<String> streamUpper = names
                .stream()
                .map(str -> str.toUpperCase());
        System.out.println("Convert String to upper case : \n");
        streamUpper.forEach(System.out::println);
    }
}
