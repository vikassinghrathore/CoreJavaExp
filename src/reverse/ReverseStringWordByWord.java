package reverse;

import java.util.Scanner;

public class ReverseStringWordByWord {
    public static String reverseTheSentence(String inputString) {
        String[] word = inputString.split("\\s");
        String outputString = "";
        for (int i = word.length - 1; i >= 0; i--) {
            outputString = outputString + word[i] + " ";
        }
        return outputString;
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String :");
        String inputString = sc.nextLine();
        String outputString = reverseTheSentence(inputString);
        System.out.println("Input String : " + inputString);//I am Java Developer
        System.out.println("Output String : " + outputString);//Developer Java am I
        sc.close();
    }*/

        String inputString = "I am Java Developer";
        System.out.println(reverseTheSentence(inputString));
        String outputString = "I love Java Programming";
        System.out.println(reverseTheSentence(outputString));
    }
}
