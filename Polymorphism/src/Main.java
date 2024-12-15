class bike{
    void run(){
        System.out.println("Bike is running");
    }
}


class yamaha extends bike{
    void run(){
        System.out.println("Yamaha bike is running");
    }
}


public class Main {
    public static void main(String[] args) {                //Polymorphism(Many-forms) = poly(Many) + morphism(forms)
                                                            //it's achieved by overloading and overriding

        bike b1= new yamaha();                                //upcasting
        b1.run();

    }
}