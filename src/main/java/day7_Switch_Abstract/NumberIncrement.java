package day7_Switch_Abstract;

public class NumberIncrement
{
    public static void main(String[] args)
    {
        //Creating Numbers in incremental order

        int value = 1;
        for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(value+ " ");
                value++;
            }
            System.out.println();
        }
    }
}
