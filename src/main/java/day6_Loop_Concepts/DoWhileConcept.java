package day6_Loop_Concepts;

public class DoWhileConcept
{
    public static void main(String[] args)
    {
        //using DOWhile loop to print 1 to 10
        //Using Do While loop it prints first and then it checks the condition later,
        //Where as While loop checks the condition first

        int i=1;

        do {
            System.out.println(i);
            //System.out.print(i);
            i++;
        }
        while(i<=10);

    }
}
