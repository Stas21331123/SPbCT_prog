
/*⦁	Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.*/

public class Task_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
