package Pr11_12_13.util;

import java.util.Random;

public class qwe {
    public static void main(String[] args) {
        qwe test = new qwe();
        Random r = new Random(100);
        // Generating the same sequence numbers
        for(int cnt=0;cnt<9;cnt++){
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        r = new Random(100);
        for(int cnt=0;cnt<9;cnt++) {
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        // Generating sequence of bytes
        byte[] randArray = new byte[8];
        r.nextBytes(randArray);
        test.dumpArray(randArray);
    }
    void dumpArray(byte[] arr) {
        for(int cnt=0;cnt< arr.length;cnt++) {
            System.out.print(arr[cnt]);
        }
        System.out.println();
    }
}
