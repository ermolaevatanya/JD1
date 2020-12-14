package HomeWork2.arrays;
import java.util.Scanner;

public class Arrays_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Введенные элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }

}
