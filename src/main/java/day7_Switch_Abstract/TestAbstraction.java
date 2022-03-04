package day7_Switch_Abstract;

public class TestAbstraction
{
    public static void main(String[] args)
    {
        ShapeAbstract shape = new SquareAbstract();
        shape.drawing();
        ShapeAbstract shape1 = new RectangleAbstract();
        shape1.drawing();
        ShapeAbstract shape2 = new CircleAbstract();
        shape2.drawing();

    }
}
