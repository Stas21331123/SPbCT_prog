package KR;

import java.util.Scanner;

public class Task_3 {
    /*1.	Пользователь вводит три числа. Найти сумму тех чисел, которые делятся на 5. Если таких чисел нет, то вывести error.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a % 5 == 0){
            System.out.println("error a");
        }
        if(b % 5 == 0){
            System.out.println("error b");
        }
        if(c % 5 == 0){
            System.out.println("error c");
        }
    }
}
class Task_3_2{
    /*2.	Дана дата из трех чисел (день, месяц и год). Вывести yes, если такая дата существует (например, 12 02 1999 - yes, 22 13 2001 - no). Считать, что в феврале всегда 28 дней*/
    public static void main(String[] args) {
        System.out.println("Введите число, месяц и год для проверки");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        switch (month){
            case 1: //янверь
            case 3: //Март
            case 5: //Май
            case 7: //Июль
            case 8: //Август
            case 10: //Октябрь
            case 12: //Декабрь
                if(day > 1 && day < 31){
                    System.out.println("Такая дата существует!");
                }else {
                    System.out.println("Такой даты не существует!");
                }
                break;
            case 2: //Февраль
                if(day > 1 && day < 28){
                System.out.println();
            }else{
                    System.out.println("Такой даты не существует!");
            }
                break;
            case 4: //Апрель
            case 6: //Июнь
            case 9: //Сентябрь
            case 11: //Ноябрь
                if(day > 1 && day < 30){
                    System.out.println("Такая дата существует!");
                }else {
                    System.out.println("Такой даты не существует!");
                }
                break;
        }

    }
}