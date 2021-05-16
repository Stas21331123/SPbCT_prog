package Pr4;

import java.util.Arrays;

public class one {
    static int [] oddEvenSort(int[] arr, int length){
        int temp[] = new int [arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;
        arr = sort(arr);
        for(int i = 0;i<arr.length;i++) {
            if((arr[i] & 1) == 0){
                temp[evenIndex] = arr[i];
                evenIndex += 1;
            }else{
                temp[oddIndex] = arr[i];
                oddIndex -= 1;
            }
        }
        return temp;
    }
    static  int [] sort(int arr[]){
        for(int i=0; i< arr.length;i++){
            for(int j = i;j < arr.length;j++) {
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {1, 3, 2, 7, 5, 4, 8, 10, 9, 13, 15 , 14};
        System.out.println("Исходный массив: " + Arrays.toString(arr) + "\n");
        int[] copyArr=null;
        copyArr = copyFullArrayUsingArrayCopyOf(arr);
        System.out.println("Полное копирование массива: " + Arrays.toString(copyArr) + "\n");
        oddEvenSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    /*Метод Get */
    private static int[] copyFullArrayUsingArrayCopyOf(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
}

