package day15_FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling
{
    public static void main(String[] args)
    {
        //using predefined class BufferedWriter, inorder to write logs into FileRead_write under resource tab
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write.txt"));
            bufferedWriter.write("Hello Java");
            bufferedWriter.write("\nSelenium Web driver");
            bufferedWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
