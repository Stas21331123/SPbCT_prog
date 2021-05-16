/*
 * 8.	Дано значение температуры в градусах Цельсия.
 * Вывести температуру  в градусах Фаренгейта.
 * Для перевода температуры из шкалы Цельсия в шкалу Фаренгейта
 * нужно умножить исходное число на 9/5 и прибавить 32.
 * */
public class Task_2 {
    public static void main(String[] args) {
        double celsius = 32;
        double Fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println("Градус Цельсия: "+celsius);
        System.out.println("Конвертация в градусы Фаренгейта. . .");
        System.out.println("Градусо Фаренгейта: "+ Fahrenheit);
    }
}
