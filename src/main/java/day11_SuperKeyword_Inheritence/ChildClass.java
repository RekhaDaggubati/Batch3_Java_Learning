package day11_SuperKeyword_Inheritence;
//Inheriting ParentClass to ChildClass
public class ChildClass extends ParentClass
{
    int b = 7;
    //creating child constructor
    ChildClass()
    {
        //Calling Parent Constructor to Child Constructor
        super();
        System.out.println("Child Constructor");
    }
    //creating Child Method
    public void childMethod()
    {
        //Calling Parent Method to Child Method
        super.parentMethod();
        System.out.println("Child Method: "+b);
        //Calling Parent Instance variable to Child method
        System.out.println("Parent Instance variable: "+super.a);
    }
    public static void main(String[] args)
    {
        ChildClass obj = new ChildClass();
        obj.childMethod();
    }
}
