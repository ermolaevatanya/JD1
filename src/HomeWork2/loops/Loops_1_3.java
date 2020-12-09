package HomeWork2.loops;

import java.util.Scanner;

public class Loops_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        int m;
        System.out.println("Введите число:");
        n = in.nextDouble();
        System.out.println("Введите степень:");
        m = in.nextInt();
        if (m<0) {
            System.out.println("Степень только положительная и целая");
        }
        int r = 1;
        for (int i = 0; i<m; ++i) {
            r *= n;
            System.out.println("Результат:" + r);
            }
        }
    }

