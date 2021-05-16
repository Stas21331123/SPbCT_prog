package Pr4;

import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 30);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n Сортировка: \n");
        Arrays.sort(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
