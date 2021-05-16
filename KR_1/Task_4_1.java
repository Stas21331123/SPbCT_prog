/*
 * 8.	Пользователь вводит курс доллара в рублях.
 * Показать таблицу цен 1$, 2$, ..., 100$ в рублях,
 * третьим столбцом добавить количество кг конфет,
 * которые можно купить на данные суммы, если цена 1 кг конфет равна 20 руб.
 * Пример: 1$ - 70 р - 3.5 кг и так далее (всего 100 строк).
 *
 * */

import java.io.*;

public class Task_4_1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Введите курс доллара: ");
        double kurs = Double.parseDouble(bufferedReader.readLine());
        for (int i = 1; i < 101; i++) {
            double dollar = i * kurs;
            double sweet = dollar / 20;
            System.out.println(i + "$" + " - " + dollar+" p" + " - " + sweet+" кг");
        }
    }
}
