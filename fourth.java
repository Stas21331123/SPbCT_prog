package PR3;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        /*4)	Успеваемость студентов оценивается по 100-балльной шкале. Оценкам от 91 до 100 соответствует разряд А, от 81 до 90 — разряд В,
        и т. д., оценкам не более 50 — разряд F. Написать программу, вводящую с клавиатуры оценку по 100-балльной шкале и печатающую соответствующий ей разряд
         */
        System.out.println("Введите оценку по 100-бальной шкале");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 91 && num <=100){
            System.out.println("A");
        } else if(num >= 81 && num <=90) {
            System.out.println("B");
        } else if (num >= 71 && num <= 80){
            System.out.println("C");
        } else  if (num >= 61 && num <= 70){
            System.out.println("D");
        } else if (num >= 51 && num <= 60){
            System.out.println("E");
        } else if (num >=0 && num <= 50){
            System.out.println("F");
        } else {
            System.out.println("Error");
        }
    }
}
