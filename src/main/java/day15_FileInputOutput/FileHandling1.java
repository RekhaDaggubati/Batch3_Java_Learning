package day15_FileInputOutput;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling1
{
    public void writeTextFile(String a, String b, String c )
    {
        //using predefined class BufferedWriter, inorder to write logs into FileRead_write under resource tab

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write.txt"));
            bufferedWriter.write(a);
            bufferedWriter.write(b);
            bufferedWriter.write(c);
            bufferedWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("FileHandling1");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        FileHandling1 obj = new FileHandling1();
        obj.writeTextFile("Hello TeamA","\nRest assured", "\nSelenium Automation");
    }
}
