package day13_MultiThreading;
//MultiThreading class extends predefined Thread
public class MultiThreading extends Thread
{
    private int threadNo;
    //created this private variable to check from which threadNo the execution of numbers are coming in parallel order
    //creating constructor
     MultiThreading(int threadNo){
        this.threadNo = threadNo;
    }
    @Override
    public void run()
    {
        //print value for 1 to 5
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(i+ " from threadNo: "+threadNo);
            try {
                //used Thread.sleep to delay the execution
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.fillInStackTrace());
            }
        }
    }
}
