package PR3;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        System.out.println("Введите оценку:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 2 -> System.out.println("Неудовлетворительно");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5 -> System.out.println("Отлично");
            default -> System.out.println("Ошибка... Диапазон чисел от 2 до 5...");
        }
    }
}
