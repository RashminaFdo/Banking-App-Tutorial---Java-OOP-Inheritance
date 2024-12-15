public class Employee {
    String name;
    int age;
    String department;

    public Employee() {
        String name= "Name example";
        int age = 00;
        String department = "Department example";
    }

    public Employee(String name, int age, String department) {      //Primary constructor
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(String name, int age) {                         //constructor overloading
        this.name = name;
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }
}
