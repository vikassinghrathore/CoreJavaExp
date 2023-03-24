package defaultmethod;

public class Java8Example implements DefaultInterfaceExample {
    //implementing abstract method
    public void existingAbastractMethod(String str) {
        System.out.println("Existing Java abstract method implementation");
    }

    public static void main(String[] args) {
        Java8Example exp = new Java8Example();
        //calling default method interface
        exp.method1();
        //calling abastract metod interface
        exp.existingAbastractMethod("Java 8 feature");

    }
}
