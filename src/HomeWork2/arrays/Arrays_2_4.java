package HomeWork2.arrays;

public class Arrays_2_4 {
    public static void main(String[] args) {
        int sum = getSum(new int[25]);
        System.out.println("Сумма четных положительных элементов массива:" + sum);
        int max = maxArray(new int [25]);
        System.out.println("Максимальный из элементов массива с четными индексами:" + max);
        int less = lessAverage(new int [25]);
        System.out.println("Элементы массива, которые меньше среднего арифметического: " + less);
    }
    public static int getSum(int [] container) {
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (i > 0 && i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        return sum;
    }
    public static int maxArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
            int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (i>max && array[i] % 2 == 0){
                max = i;
            }
        }
        System.out.println();
        return max;
    }
    public static int lessAverage(int [] container){
        for (int i = 0; i < container.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (i > 0) {
                sum += i;
            }
        }
            System.out.print("Сумма: " + sum);
            System.out.println();
        int avrg = sum / container.length;
        System.out.println("Среднее арифметическое: " + avrg);
        int less = 0;
        for (int i = 0; i < container.length; i++) {
            if (i < avrg) {
                less = i;
            }
        }
            return less;
        }
    }





