import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 8.	Дано число. Если оно от 2 до 5 включительно, то увеличить его на 10.
 *   Если оно от 7 до 40, то уменьшить на 100.
 *   Если оно не более 0 или более 3000, то увеличить в 3 раза (то есть умножить на 3).
 *   Иначе занулить это число.
 *
 * */
public class Task_3_1 {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

            if (number > 1 && number < 6) {
                number += 10;
                System.out.println(number);
            } else if (number > 6 && (number < 41)) {
                number -= 100;
                System.out.println(number);
            } else if (number < 0 | number > 3000) {
                number *= 3;
                System.out.println(number);
            } else {
                number = 0;
                System.out.println(number);
            }


    }
}
