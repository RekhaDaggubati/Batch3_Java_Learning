package day6_Loop_Concepts;

public class InnerLoopDecrement
{
    public static void main(String[] args)
    {
        //creating  numbers Decrement in each new line using inner loops
        int i;
        int j;
        for(i=1; i<=5; i++)
        {
            for(j=5; j>=i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
