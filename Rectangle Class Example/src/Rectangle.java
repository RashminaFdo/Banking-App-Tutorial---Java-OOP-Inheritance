public class Rectangle {
    double length;                      //INSTANCE
    double width;                       //VARIABLES
    static int count;


    public Rectangle(){                 //Default constructor
        length= 5;
        width=2;
        count++;
    }

    public Rectangle(double length, double width) {         //Parameterized constructor
        this.length = length;
        this.width = width;
        count++;
    }


    public double getArea(){                //to calculate area
        return length* width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

}
