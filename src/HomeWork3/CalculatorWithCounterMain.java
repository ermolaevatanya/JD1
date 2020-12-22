package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithOperator());
        double add = calc.add(15, 7);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
