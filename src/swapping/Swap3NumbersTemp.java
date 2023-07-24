package swapping;

public class Swap3NumbersTemp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        // Printing values of numbers before swapping
        System.out.println("Original values before swapping are:");
        System.out.println("Value of  is x " + x);
        System.out.println("Value of y is " + y);
        System.out.println("Value of z is " + z);

           int temp=x;
           x=y;
           y=z;
           z=temp;

        // Printing values of numbers after swapping
        System.out.println("Original values before swapping are:");
        System.out.println("Value of  is x " + x);
        System.out.println("Value of y is " + y);
        System.out.println("Value of z is " + z);
    }
}