public class Calculator {
    public void  addition(int a, int b){
        System.out.println("Total of the addition (int): "+(a+b));
    }
    public void  addition(double a, double b){                           //different data types
        System.out.println("Total of the addition (double): "+(a+b));
    }

    public void  addition(int a, int b, int c){                         //different parameter
        System.out.println("Total of the addition (3 inputs): "+(a+b+c));
    }
}
