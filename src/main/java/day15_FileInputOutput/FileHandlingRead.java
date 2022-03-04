package day15_FileInputOutput;
import java.io.*;
public class FileHandlingRead
{
    public void fileRead() throws IOException {
        try
        {
            //Using predefined BufferedReader class to read the file from resource tab
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/FileRead_Write.txt"));
            String line;
            //using while loop for reading multiple lines from file
            while ((line = bufferedReader.readLine())!= null)
            {
                System.out.println(line);
                bufferedReader.close();
            }
            //bufferedReader.close();
        }
        catch(IOException e)
            {
                //using BufferedWriter class to write exception logs into file under resource tab
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/ExceptionLog.txt"));
                bufferedWriter.write(e.toString());
                bufferedWriter.close();
            }
    }
    public static void main(String[] args) throws IOException
    {
        FileHandlingRead obj = new FileHandlingRead();
        obj.fileRead();
    }
}
