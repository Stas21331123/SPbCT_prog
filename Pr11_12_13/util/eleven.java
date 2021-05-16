package Pr11_12_13.util;

import java.util.TreeMap;

public class eleven {
    public static void main(String[] args) {
        eleven t = new eleven();
        TreeMap tm = new TreeMap();
        tm.put("key","String1");
        System.out.println(tm.get("key"));
        tm.put("key","String2");
        System.out.println(tm.get("key"));
    }
}
