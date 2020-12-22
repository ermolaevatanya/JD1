package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator{
    public double pow(double a, int b){
        return Math.pow(a, b);
    }

    public double abs(double a){
        return Math.abs(a);
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
