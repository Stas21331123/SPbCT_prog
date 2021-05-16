package PR3;

import java.util.Scanner;

import static java.lang.Math.*;

public class five {
    public static void main(String[] args) {
        /*Составить программу для вычисления значений функции y = f(x) при произвольных значениях х. Получить результат работы программы для двух заданных значений х.
          y= / sqrt(a+ |sin x|)     при x> 4
             \ tg(bx)               при x< 4
            a= 3.9 b= 4.8. 1) x= 5.17 2) x= -2.35
         */
        System.out.println("Введите X" + "\n");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = 3.9;
        double b = 4.8;
        if(x > 4){
            System.out.println(sqrt(a + abs(sin(x))));
        } else if (x < 4) {
            System.out.println(tan(b * x));
        } else {
            System.out.println("error");
        }
    }
}
