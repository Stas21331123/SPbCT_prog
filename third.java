package PR3;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        //Написать программу, которая по названию дня недели печатает его номер (воскресенье - 0, понедельник - 1, ..., суббота - 6)
        System.out.println("Введите название дня недели");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        switch (string){
            case "Понедельник" -> System.out.println("1");
            case "Вторник" -> System.out.println("2");
            case "Среда" -> System.out.println("3");
            case "Четверг" -> System.out.println("4");
            case "Пятница" -> System.out.println("5");
            case "Суббота" -> System.out.println("6");
            case "Воскресенье" -> System.out.println("0");
            default -> System.out.println("Ошибка ввода...");
        }
    }
}
