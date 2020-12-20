package HomeWork3;

public class WithOutCalculatorMain {
    public static void main(String[] args) {
        double i = 4.1 + 15 * 7 + pow(5.6);
        System.out.println(i);
    }
    public static double pow (double value){
        return value*value;
    }
}
