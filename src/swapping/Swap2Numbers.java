package swapping;

public class Swap2Numbers {
    public static void main(String[] args){
        int x = 10, y = 20;
        System.out.println("Before Swap");
        System.out.println("x = " + x); System.out.println("y = " + y);
        //with temp variable
       // int temp = x;
       // x = y;
       // y = temp;

        //whithout temp variable
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap");
        System.out.println("x = " + x); System.out.println("y = " + y);
    }
}
