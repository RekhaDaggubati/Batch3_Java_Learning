package day5_Conditional_Encapsulation;

public class VoterStatus
{
    public void Vote(int age)
    {
        if ( age >= 18)
        {
            System.out.println("Voter is major, eligible to vote");
        }
        else if( (age > 0) && (age < 18))
        {
            System.out.println("Voter is minor, not eligible to vote");
        }
        else
        {
            System.out.println("Enter the correct age");
        }
    }

    public static void main(String[] args)
    {
        VoterStatus obj = new VoterStatus();
        obj.Vote(0);
    }
}
