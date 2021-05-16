/*
14.	Пользователь вводит сумму вклада в банк и годовой процент.
Найдите сумму вклада через 5 лет (рассмотреть два способа начисления процентов)

 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task_2_2 {

    static double pow(double value, double powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1.00);
        }
    }

    public static void main(String[] args) throws Exception {

        // Объявление переменной для ввода с клавиатуры
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите сумму денежных средств, которую хотите положить в банк: ");
        String moneyS = bufferedReader.readLine();
        double moneyD = Double.parseDouble(moneyS);

        System.out.print("Под какой процент: ");
        //переделываем строку в double
        double procent = Double.parseDouble(bufferedReader.readLine());


        double sposob1 = pow(1.00 + 0.01 * procent, 5) * moneyD;
        System.out.println("Если каждый год начисляется " + procent + " , Ваша сумма итоговая сумма: " + sposob1);

        double sposob2 = moneyD+moneyD*0.01*procent;
        System.out.println("Если каждый год снимаете проценты, то Ваша сумма итоговая сумма на вкладе: " + sposob2);

    }
}
