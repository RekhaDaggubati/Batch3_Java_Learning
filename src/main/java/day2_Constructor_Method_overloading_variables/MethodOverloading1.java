package day2_Constructor_Method_overloading_variables;

public class MethodOverloading1 {

    public void Area(int length,int width)
    {
        //Area of Rectangle

        int area = length*width;
        System.out.println("Area of rectangle is " + area);
    }
    public void Area(int side)
    {
        //Area of Square
        this.Area(4,5);
        int area = side*side;
        System.out.println("Area of square is " + area);
    }
    public void Area(double base , double height)
    {
        //Area of Triangle
        this.Area(5);
        double area = (base*height)/2;
        System.out.println("Area of triangle is " + area);
    }
    public void Area(double radius)
    {
        //Area of circle
        this.Area(4.0,5.0);
        double area = 3.14*(radius*radius);
        System.out.println("Area of circle is " + area);
    }
    //main method
    public static void main(String[] args) {
        MethodOverloading1 obj = new MethodOverloading1();
        obj.Area(5.0);
    }
    
}
