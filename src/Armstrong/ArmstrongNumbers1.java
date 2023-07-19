package Armstrong;

import java.util.stream.IntStream;
public class ArmstrongNumbers1 {
    public static boolean isArmstrong(int num) {
        return num == getArmstrongSum(num);
    }public static int getArmstrongSum(int num) {
        int pow = String.valueOf(num).length();
        return IntStream.iterate(num, i -> i / 10)
                .limit(pow)
                .map(i -> (int) Math.pow(i % 10, pow))
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(getArmstrongSum(370));
        System.out.println(isArmstrong(370));
    }
}