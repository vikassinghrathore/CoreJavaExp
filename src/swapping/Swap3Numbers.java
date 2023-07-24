package swapping;

public class Swap3Numbers {
        public static void main(String[] args){
            int x= 10; int y= 20; int z= 30;
           // Printing values of numbers before swapping in order to see the change
            System.out.println("Original values before swapping are:");
            System.out.println("Value of  is x " +x);System.out.println("Value of y is " +y);System.out.println("Value of z is " +z);

            x = x+ y+ z;
            y = x- (y+ z);
            z = x- (y+ z);
            x = x- (y+ z);

           // Printing values of numbers after swapping in order to see the change
            System.out.println("Original values before swapping are:");
            System.out.println("Value of  is x " +x);
            System.out.println("Value of y is " +y);
            System.out.println("Value of z is " +z);
        }
    }

