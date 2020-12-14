package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2_2 {
    public static void main(String[] args) {
        int [] arr = arrayFromConsole();
        System.out.println("Все элементы массива: " + Arrays.toString(arr));
        int [] arr2 = eachSecondElement(arr);
        System.out.println("Каждый второй элемент массива: " + Arrays.toString(arr2));
        int [] arr3 = revesedElements(arr);
        System.out.println("Все элементы массива в обратном порядке: " + Arrays.toString(arr3));
    }
    public static int[] arrayFromConsole(){
        System.out.println("Размер массива: ");
        Scanner in = new Scanner(System.in);
        int lengthArr = in.nextInt();
        int [] arr = new int [lengthArr];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i;
        }
        return arr;
    }
    public static int [] eachSecondElement(int [] arr){
        int [] arr2 = Arrays.copyOf(arr, arr.length);
        for (int i = 2; i < arr2.length; i+=2) {
            arr2[i] = i;
            }
        return arr2;
        }
     public static int [] revesedElements (int [] arr) {
        int [] arr3 = Arrays.copyOf(arr, arr.length);
         for (int i = arr3.length -1; i >= 0 ; i--) {
             arr3[i] = i;
         }
        return arr3;
     }
    }
