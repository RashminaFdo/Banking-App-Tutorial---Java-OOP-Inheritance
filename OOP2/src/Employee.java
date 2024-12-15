public class Employee {
    String name;                            //instance variable
    int age;
    final String Dpt="IT";

    public void agefinder(){                //instance variable
        String a="Adult"; //Local Variable
        String b="Child";

        if (age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }
        System.out.println(name);
    }
}
