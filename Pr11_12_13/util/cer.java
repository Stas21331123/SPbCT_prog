package Pr11_12_13.util;

import java.util.StringTokenizer;

public class cer {
    public static void main(String[] args) {
        cer test = new cer();
        String toParse =
                "word1;word2;word3;word4";
        StringTokenizer st =
                new StringTokenizer(toParse,";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

