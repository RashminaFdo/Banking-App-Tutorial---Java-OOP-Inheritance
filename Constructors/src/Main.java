public class Main{
    public static void main(String[] args){
    Employee e1 = new Employee();
        System.out.println(e1.name+" | "+e1.age+" | "+e1.dpt);

        Employee e2 = new Employee("Rashmina",21,"ICT");
        System.out.println(e2.name+" | "+e2.age+" | "+e2.dpt);

        Employee e3 = new Employee("Rashmina",21);
        System.out.println(e3.name+" | "+ e3.age+" | "+ e3.dpt);
    }
}