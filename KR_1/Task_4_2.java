import java.io.*;

/*
 *39.	Дано натуральное число. Найдите количество четных цифр.
 * */
public class Task_4_2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        int even = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) even++;
        }
        System.out.println("Количество четных цифр: " + even);
    }
}
