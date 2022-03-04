package day15_FileInputOutput;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class NumberException
{
    String val;
    public int number(String val) throws IOException
    {
        try {
              int no = Integer.parseInt(val);
            return no;
        }
        catch(NumberFormatException e)
        {
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("src/main/resources/NumberLog.txt"));
            writer1.write(e.toString());
            writer1.close();
        }
        return 0;
    }
    public static void main(String[] args) throws IOException
    {
        NumberException obj = new NumberException();
        int c = obj.number("Hello");
        System.out.println(c);
    }
}
