package staticmethod;

public class Java8Example implements StaticInterfaceExample {
    @Override
    public void existingabstractMethod(String str) {
        System.out.println("Existing Java abstract method implementation");
    }

    public static void main(String[] args) {
        Java8Example exp = new Java8Example();
        exp.method();//call default method of interface
        exp.existingabstractMethod("Java8 Features");
        StaticInterfaceExample.staticMethod();//call static method using interface
    }
}
