package practicing_Java;

public class LargestRetrievingEncapsulation
{
    public static void main(String[] args) {
        LargestNoEncapsulation obj = new LargestNoEncapsulation();
        obj.setA(100);
        obj.setB(50);
        obj.setC(200);
        //obj.getA();
        //obj.getB();
        //obj.getC();
        String val = obj.checkLargestNo(obj.getA(), obj.getB(), obj.getC());
        System.out.println(val);

}
}

