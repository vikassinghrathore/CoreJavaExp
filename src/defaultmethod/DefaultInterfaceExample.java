package defaultmethod;

interface DefaultInterfaceExample {
    //abstract method, need to implement in implementing classes
    public void existingAbastractMethod(String str);

    //This is a default method, no need to implement in the implementation classes.
    default void method1() {
        System.out.println("Java8 Default Method");
    }
}
