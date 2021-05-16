package PR3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 100){
            System.out.println("less");
        } else {
            System.out.println("not less");
        }
    }
}
