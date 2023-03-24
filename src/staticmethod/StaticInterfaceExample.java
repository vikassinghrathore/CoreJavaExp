package staticmethod;

interface StaticInterfaceExample {
    default void method() {
        System.out.println("Java8 Default Method");
    }
    static void staticMethod() {
        System.out.println("Java8 Static Method");
    }
    // abstract method, need to implement in implementing classes
    public void existingabstractMethod(String str);
}

