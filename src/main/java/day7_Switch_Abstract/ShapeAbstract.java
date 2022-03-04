package day7_Switch_Abstract;
//Creating Abstract class
abstract public class ShapeAbstract
{
    //Creating Abstract method

    abstract void drawing();
   //Abstract class can also have normal methods, that is why it is not hiding 100%, so 1-100%
    public void hello()
    {
        System.out.println("Hello");
    }
}
