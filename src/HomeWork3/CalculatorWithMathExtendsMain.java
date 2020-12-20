package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double a = calculator.div(28,5);
        double b = calculator.pow(a,2);
        double c = calculator.multi(15,7);
        double d = calculator.add(4.1, c);
        double e = d + b;
        System.out.println(e);
    }
}
