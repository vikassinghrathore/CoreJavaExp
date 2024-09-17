package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {

        //add numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9,10);
        //int sum = numbers.parallelStream().reduce(0, Integer::sum);
        // int sum =numbers.stream().reduce(0,(num1,num2)->num1+num2);

        //int sum = numbers. stream (). reduce (0, ArithmeticUtils::add);
       /* class ArithmeticUtils {
            public static int add (int number1, int number2) {
                return number1 + number2;*/
        int sum = numbers. stream (). collect (Collectors.summingInt(Integer::intValue));
        System.out.println("SUM TOTAL :" + sum);
    }
}
