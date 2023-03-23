package map;

public class Student {
    String name;
    double percentage;
    String department;

    public Student(String name, double percentage, String department) {
        super();
        this.name = name;
        this.percentage = percentage;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

