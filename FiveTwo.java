package PR3;

import java.util.Scanner;
import static java.lang.Math.*;

public class FiveTwo {
    public static void main(String[] args) {
         /* Составить программу для вычисления значений функции y=f(x) при произвольных значениях x.
               /  x^2 - a*x     при x <= -1
           y= |   1/(x^2+2)     при x > 4
               \  cbrt(x+1)^2   при -1 < x <= 4
         a = 1.7 1) -2.61 2) 1.49 3) 5.56
         */

        System.out.println("Введите X" + "\n");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double a = 1.7;
        if (x <= -1){
            System.out.println(pow(x,2) - a*x);
        } else if (x > 4){
            System.out.println(1/(pow(x,2)+2));
        } else if( x > -1 &&  x <= 4){
            System.out.println(cbrt(pow(x+1,2)));
        } else {
            System.out.println("error");
        }
    }
}
