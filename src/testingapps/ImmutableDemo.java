package testingapps;

public class ImmutableDemo
{
    public static void main(String ar[])
    {
        Employee e = new Employee("DPDPS3737D");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);

    }
}

