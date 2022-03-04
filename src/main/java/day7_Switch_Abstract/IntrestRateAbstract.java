package day7_Switch_Abstract;

public class IntrestRateAbstract
{
    public static void main(String[] args)
    {
        BankAbstract bank = new BofaAbstract();
        bank.RateofInterest();

        BankAbstract bank1 = new ChaseAbstract();
        bank1.RateofInterest();

        BankAbstract bank2 = new WellsfargoAbstract();
        bank2.RateofInterest();

        BankAbstract bank3 = new DCUAbstract();
        bank3.RateofInterest();

    }
}
