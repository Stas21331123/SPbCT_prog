package Pr11_12_13.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Properties;

public class rec {
    public static void main(String[] args) {
        rec test = new rec();
        Properties props = new Properties();
        StringWriter sw = new StringWriter();
        sw.write("Key1 = Value1 \n");
        sw.write(" Key2 : Value2 \r\n");
        sw.write(" Key3 Value3 \n ");
        InputStream is = new ByteArrayInputStream(sw.toString().getBytes());

        try {
            props.load(is);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        props.list(System.out);
        props.setProperty("Key1","Modified Value1");
        props.setProperty("Key4","Added Value4");
        props.list(System.out);
    }
}
