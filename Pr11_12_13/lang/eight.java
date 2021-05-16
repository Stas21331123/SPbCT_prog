package Pr11_12_13.lang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class eight {
    public static void main(String[] args) {
        System.out.println("Study Java");
        try {
            PrintStream print = new PrintStream(new
                    FileOutputStream("d:\\file2.txt"));
            System.setOut(print);
            System.out.println("Study well");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
