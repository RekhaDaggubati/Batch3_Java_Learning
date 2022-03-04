package day13_MultiThreading;

public class MultiTest
{
    public static void main(String[] args)
    {
       // MultiThreading obj = new MultiThreading();
        //obj.run();
        //run() is executing in sequential order
        //start() is executing in parallel order
       /* obj.start();
        MultiThreading obj1 = new MultiThreading();
        obj1.start();*/
        //instead of executing same staements entering 3 times we can write the execution statements in the for loop
        for (int i=1; i<=3; i++){
            MultiThreading obj = new MultiThreading(i);
            obj.start();
        }
    }
}
