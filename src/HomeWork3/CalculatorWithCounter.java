package HomeWork3;

public class CalculatorWithCounter {

    private long countOperation = 0;

    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;

    public CalculatorWithCounter(CalculatorWithOperator calc){
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc){
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc){
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    public double plus(double a, double b){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.plus(a, b);
        } else if(this.calc2 != null){
            return this.calc2.plus(a, b);
        } else {
            return this.calc3.plus(a, b);
        }
    }

    public double minus(double a, double b){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.minus(a, b);
        } else if(this.calc2 != null){
            return this.calc2.minus(a, b);
        } else {
            return this.calc3.minus(a, b);
        }
    }

    public double div(double a, double b){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.div(a, b);
        } else if(this.calc2 != null){
            return this.calc2.div(a, b);
        } else {
            return this.calc3.div(a, b);
        }
    }

    public double add(double a, double b){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.add(a, b);
        } else if(this.calc2 != null){
            return this.calc2.add(a, b);
        } else {
            return this.calc3.add(a, b);
        }
    }

    public double pow(double a, int b){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.pow(a, b);
        } else if(this.calc2 != null){
            return this.calc2.pow(a, b);
        } else {
            return this.calc3.pow(a, b);
        }
    }

    public double abs(double a){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.abs(a);
        } else if(this.calc2 != null){
            return this.calc2.abs(a);
        } else {
            return this.calc3.abs(a);
        }
    }

    public double sqrt(double a){
        this.countOperation++;
        if(this.calc1 != null){
            return this.calc1.sqrt(a);
        } else if(this.calc2 != null){
            return this.calc2.sqrt(a);
        } else {
            return this.calc3.sqrt(a);
        }
    }

    public long getCountOperation() {
        return countOperation;
    }
}
