package day6_Loop_Concepts;

public class InnerLoopConcepts
{
    public static void main(String[] args)
    {
        //printing numbers in incremental pattern using inner loops
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
