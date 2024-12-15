public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.name = "Lahiru";
        e1.age = 15;

        e2.name = "Akalanka";
        e2.age = 18;

        e3.name = "Sumudu";
        e3.age = 12;

        Employee.department="Maintanance";

        e1.show();
        e2.show();
        e3.show();

    }
}