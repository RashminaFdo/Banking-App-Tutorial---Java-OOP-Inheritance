public class Main {
    public static void main(String[] args) {

        //classes and objects

        Car MyCar = new Car();  //creating an object
        MyCar.color="Red";      //initialize the attributes
        MyCar.name="Toyota";
        MyCar.speed=150;
        MyCar.weight=1000;
        MyCar.no=1231;

        MyCar.speed();          //method
        MyCar.color();


        Car C2 = new Car();
        Car C3 = new Car();
        C2.speed();
        C2.color();


    }
}