package KR;

import java.io.Console;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Task_4 {
    /*1.	Вывести все пятизначные числа, которые делятся на 2, у которых средняя цифра нечетная, и сумма всех цифр делится на 4.*/
    public static void main(String[] args) {
        int minRange = 10000;
        int maxRange = 99999;

        System.out.println("Numbers: " + printNumbers(minRange, maxRange));
    }

    private static String printNumbers(int min, int max) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        IntStream.rangeClosed(min, max).
                filter(n ->  n / 10_000 != 0 && n / 100_000 == 0).
                filter(n -> n % 2 == 0).
                filter(n -> n / 100 % 10 % 2 == 1).
                filter(n -> IntStream.rangeClosed(0, 4).map(x -> n / (int)(Math.pow(10, x)) % 10).sum() % 4 == 0).
                mapToObj(String::valueOf).forEach(sj::add);
        return sj.toString();
    }
}
class Task_4_2{
    /*2.Дано n кирпичей. Вы и компьютер ходите поочередно. за ход можно взять 1, 2 или 3 кирпича. Проиграл тот, кому нечего брать.
    Реализуйте игру с компьютером. Компьютер ходит случайно (без анализа выигрышной стратегии),
    однако если у него есть ход, который является последним для его выигрыша, то он его совершает.*/
    public static void main(String[] args) {

    }
}
