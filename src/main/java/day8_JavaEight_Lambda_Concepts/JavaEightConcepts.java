package day8_JavaEight_Lambda_Concepts;
//using @FunctionalInterface to avoid writing one more abstract method
@FunctionalInterface
//creating Interface
interface Car
{
    //creating abstract method
    public void driving();
}
//implementing interface with class
public class JavaEightConcepts //implements Car
{
    //retrieving abstract method in to class
   /* public void driving()
    {
        System.out.println("I am Driving");
    }*/
//creating object , interface and abstract name is left side and class name is right side
    public static void main(String[] args) {
        /*Car obj = new JavaEightConcepts();
        obj.driving();*/
        //using Lambda expression and reducing of retrieving abstract method into class
        Car obj = () -> System.out.println("I am Driving");
        obj.driving();

    }
}
