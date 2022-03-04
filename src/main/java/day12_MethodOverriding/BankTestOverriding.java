package day12_MethodOverriding;

public class BankTestOverriding
{
    public static void main(String[] args) {
        BOFAOverriding obj = new BOFAOverriding();
        System.out.println("BOFA RateOfInterest is: "+obj.rateOfInterest());
        ChaseOverriding obj1 = new ChaseOverriding();
        System.out.println("Chase RateOfInterest is: "+obj1.rateOfInterest());
    }
}
