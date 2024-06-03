package in.co.Abstraction;

public class Employee extends Sunstar {

    @Override
    void printinfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
    }
}
