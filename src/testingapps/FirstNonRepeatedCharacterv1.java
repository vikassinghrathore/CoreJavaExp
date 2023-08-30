package testingapps;
public class FirstNonRepeatedCharacterv1 {
    public static void main(String[] args) {
        String inputString = "teerrer";
        for (char i : inputString.toCharArray()) {
            if (inputString.indexOf(i) == inputString.lastIndexOf(i)) {
                System.out.println("First non-repeating character here is: " + i);
                break;
            }
        }
    }
}
