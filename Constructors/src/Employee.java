public class Employee {
    String name;
    int age;
    String dpt;

    Employee(){                         //Default constructor (non-parameterized constructor)
        this.name="Employee";
        this.age=20;
        this.dpt="IT";
    }

    public Employee(String name, int age, String dpt) {     //Parameterized constructor
        this.name = name;
        this.age = age;
        this.dpt = dpt;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
