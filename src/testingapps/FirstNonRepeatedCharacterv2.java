package testingapps;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterv2 {
    public static void main(String[] args) {
        System.out.println("First NonRepated  in String : is "+firstNonRepeatedCharacter("AMAZING"));
    }
    public static Optional<Character> firstNonRepeatedCharacter(String inputString) {
        Map<Character,Long> charCount=inputString
                                         .chars().mapToObj(c->(char)c)
                                         .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return inputString.chars().mapToObj(c->(char)c).filter(c->charCount.get(c)==1).findFirst();
    }
}
