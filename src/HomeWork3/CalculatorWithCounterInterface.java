package HomeWork3;

public class CalculatorWithCounterInterface {
    private long countOperation = 0;

    private final ICalculator calc;

    public CalculatorWithCounterInterface(ICalculator calc){
        this.calc = calc;
    }

    public double plus(double a, double b){
        this.countOperation++;
        return this.calc.plus(a, b);
    }

    public double minus(double a, double b){
        this.countOperation++;
        return this.calc.minus(a, b);
    }

    public double div(double a, double b){
        this.countOperation++;
        return this.calc.div(a, b);
    }

    public double add(double a, double b){
        this.countOperation++;
        return this.calc.add(a, b);
    }

    public double pow(double a, int b){
        this.countOperation++;
        return this.calc.pow(a, b);
    }

    public double abs(double a){
        this.countOperation++;
        return this.calc.abs(a);
    }

    public double sqrt(double a){
        this.countOperation++;
        return this.calc.sqrt(a);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
