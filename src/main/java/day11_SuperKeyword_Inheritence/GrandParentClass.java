package day11_SuperKeyword_Inheritence;

public class GrandParentClass
{
    int c = 10;
    //Creating GrandParent Constructor
    GrandParentClass()
    {
        System.out.println("GrandParent Constructor");
    }
    //Creating GrandParent Method
    public void grandparentMethod()
    {
        System.out.println("GrandParent Method:  "+c);
    }
}
