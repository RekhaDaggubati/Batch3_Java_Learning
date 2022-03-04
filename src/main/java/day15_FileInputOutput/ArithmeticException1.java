package day15_FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArithmeticException1 {
    int a;
    int b;
    int c;
    public int divideNo(int a, int b) throws IOException {
        try {
            this.a = a;
            this.b = b;
            return c = a/b;
        } catch (ArithmeticException e) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/ArithmeticLog.txt"));
            writer.write(e.toString());
            writer.close();
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        ArithmeticException1 obj = new ArithmeticException1();
        obj.divideNo(10,0);
    }
}