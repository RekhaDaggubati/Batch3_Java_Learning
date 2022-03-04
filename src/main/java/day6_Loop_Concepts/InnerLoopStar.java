package day6_Loop_Concepts;

public class InnerLoopStar
{
    public static void main(String[] args)
    {
        //Printing star in incremental pattern using inner loops
        int i;
        int j;
        for (i=1; i<=5; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
