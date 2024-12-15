public class Main{
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println(r1.count);
        Rectangle r2 = new Rectangle(5,4);
        System.out.println(r1.count);
        Rectangle r3 = new Rectangle(10,6);
        System.out.println(r1.count);


        System.out.println("Rectangle 1 area: "+ r1.getArea()+" | R1 Perimeter: "+ r1.getPerimeter());
        System.out.println("Rectangle 2 area: "+ r2.getArea()+" | R2 Perimeter: "+ r2.getPerimeter());
        System.out.println("Rectangle 3 area: "+ r3.getArea()+" | R3 Perimeter: "+ r3.getPerimeter());

r1.length=15;
r1.width=10;

        System.out.println("Rectangle 1 area after changing the values: "+ r1.getArea()+" | R1 Perimeter after changing the values: "+ r1.getPerimeter());


    }
}