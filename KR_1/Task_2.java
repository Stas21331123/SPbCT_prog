package KR;

import java.util.Scanner;

public class Task_2 {
    /*1.	Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.*/
    public static void main(String[] args) {
        int P, S;
        System.out.print("Введите сторону квадрата:");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        P = 4*w;
        S = w*w;
        System.out.println("Площаль квадрата равна:" + S);
        System.out.println("Периметр квадрата равна:" + P);
    }
}
class Task_2_2{
    /*2.	Известно, что x кг конфет стоит a рублей. Определите, сколько стоит y кг этих конфет, а также сколько кг конфет можно купить на k рублей. Все значения вводит пользователь.*/
    public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ввод кол-ва кг конфет. x = ");
    int x = scanner1.nextInt(); //Ввод кол-ва кг конфет
        System.out.print("Ввод стоимости х кг конфет а=");
    int a = scanner1.nextInt(); //Ввод стоимости х кг конфет
        System.out.print("Ввод другого количества кг  y = ");
    int y = scanner1.nextInt(); //Ввод другого количества кг конфет по а цене.
        System.out.print("Цена за k кг конфет: " );
    int k = scanner1.nextInt(); //Ввод количества денег, на которые можно купить и х кг и у кг конфет.

    // Возьмем что х=2 кг конфет стоит а= 500 рублей. Тогда у=4 кг этих же конфет будет стоит 1000 рублей.
    int z = a*2; //Просто увеличим цену в два раза. Т.е. 1 кг конфет стоит 125 условно.
    int r = k / 1000 * 4;
        System.out.println("Количество кг конфет. x = " + x);
        System.out.println("Цена сколько стоят х кг конфет а=" + a);
        System.out.println("Количество кг конфет y = " + y);
        System.out.println("Цена за у кг конфет: " + z);
        System.out.println("Сколько кг конфет можно купить на k денег " + r);
    }
}