package testingapps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //start with nubers

           /* List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
            listOfStrings.stream(). filter (str -> Character.isDigit(str. charAt(0)))
                    . forEach (System.out::println)
        }*/

        //start with characters
       /*List<String> names = Arrays.asList("Ava", "Alberto", "Sarah", "Sam", "Smith");
        names = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        names.forEach(System.out::println);
*/

        List<String> names = Arrays.asList("Ava", "Alberto", "Sarah", "Sam", "Smith");
        Stream<String> namesStartsWith = names.stream().filter(s -> s.startsWith("S"));
        System.out.println(namesStartsWith.collect(Collectors.toList()));

    }
}





