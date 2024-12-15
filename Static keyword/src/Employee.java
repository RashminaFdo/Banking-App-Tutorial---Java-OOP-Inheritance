public class Employee {
    String name;                        //instance
    int age;
    static String department;           //depends on the class

    static {
        department = "IT";              //class load
        System.out.println("In static block");
    }



    public Employee() {
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(name+" | "+age+" | "+department);
    }
}
