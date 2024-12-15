public class Child extends Parent{
    public Child() {
        super();
        System.out.println("Inside the default constructor of Child class");

    }

    public Child(int a){
        super(a);
        System.out.println("Inside the parameterized constructor of Child class");
    }
}
