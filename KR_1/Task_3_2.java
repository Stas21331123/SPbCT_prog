/*
*34.	Даны числа h и m, где h - количество часов,
* m - количество минут некоторого момента времени.
* Найдите угол между часовой и минутной стрелками в этот момент времени
* */

import java.io.*;

public class Task_3_2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите на каком числе часовая стрелка: ");
        double hour = Double.parseDouble(bufferedReader.readLine());

        System.out.print("Введите на каком числе минутная стрелка: ");
        double minute = Double.parseDouble(bufferedReader.readLine());

        double result = Math.abs((hour * 30 + minute * 0.5) - (minute * 6));

        System.out.println("Меньший угол составляет: "+Math.min(360-result,result)+" градусов.");

    }
}
