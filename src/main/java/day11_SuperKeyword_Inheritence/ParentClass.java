package day11_SuperKeyword_Inheritence;
//Inheriting GrandParentClass to ParentClass
public class ParentClass extends GrandParentClass
{
    int a = 5;

    //creating Parent Constructor
    ParentClass()
    {
        //Calling GrandParent Constructor
        super();
        System.out.println("Parent Constructor");
    }
    //creating Parent method
    public void parentMethod()
    {
        //Calling GrandParent Method to Parent Method
        super.grandparentMethod();
        System.out.println("parent method: "+a);
        //Calling GrandParent Instance Variable to Parent Method
        System.out.println("GrandParent Instance Variable:  "+super.c);
    }

}
