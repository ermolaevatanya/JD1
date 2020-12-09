package HomeWork2.arrays;

public class Arrays_2_4 {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("Сумма:" + sum);
        //int max = maxArray();
        System.out.println("Максимальный из элементов массива с четными индексами:");

    }
    public static int getSum() {
        int [] container = new int [15];
        int sum = 0;
        for (int i = 0; i <= container.length; i++) {
            if (i > 0 && i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
            return sum;
    }
    //public static int maxArray(){


    //}

}

