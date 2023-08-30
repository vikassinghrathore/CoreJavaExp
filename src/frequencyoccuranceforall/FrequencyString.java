package frequencyoccuranceforall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {
    public static void main(String[] args) {
        String inputString = "gain java knowledge";//java 8 stream to find frequency of each character in a given String.
        // Map<String,Long> countMap= Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),counting()));
        //Map<Character,Long> countMap=inputString.chars(). mapToObj (c -> (char) c). collect (Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character ch = inputString.charAt(i);
            countMap.computeIfPresent(ch, (character, count) -> count + 1);
            countMap.computeIfAbsent(ch, (character) -> 1);
        }
        System.out.println(countMap);
    }
}

