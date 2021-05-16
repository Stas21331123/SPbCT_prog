/*
* 2.	Вывести квадрат 7 на 7 из случайных букв.
 * */


import java.util.Random;

public class Task_5_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                Random r = new Random();
                System.out.print((char) (r.nextInt(26) + 'a')+" ");
            }
            System.out.println();
        }

    }

}
