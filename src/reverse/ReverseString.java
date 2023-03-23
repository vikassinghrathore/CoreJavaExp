package reverse;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Vikas";
        char[] ch = input.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}