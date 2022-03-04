package day15_FileInputOutput;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
public class ReadingExcel
{
    public static void main(String[] args) throws FilloException
    {
        //To read the values from Excel Sheet
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("src/main/resources/ExcelHandling.xlsx");
        //writing the sql query to retrieve values from Sheet1
        String strQuery="Select * from Sheet1 where TestCaseId = 'TC002'";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next()){
            System.out.println(recordset.getField("TestCaseId"));
            System.out.println(recordset.getField("Result"));
        }

        recordset.close();
        connection.close();
    }

}
