package java17;

public sealed class Person permits Employee, Manager {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
//Explanation
//Sealed Class: The Person class is sealed, meaning it restricts which classes can extend it.
//Permits Clause: The permits clause specifies that only Employee and Manager can extend Person.
//Final Subclasses: Employee and Manager are marked as final, ensuring they cannot be further subclassed.