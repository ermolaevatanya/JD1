package HomeWork3;

public class CalculatorWithMathCopy {
    public double div(double a, double b){
        double result1 = a/b;
        return result1;
    }
    public int multi(int a, int b){
        int result2  = a * b;
        return result2;
    }
    public int sub(int a, int b){
        int result3 = a-b;
        return result3;
    }
    public double add(double a, double b){
        double result4 = a+b;
        return result4;
    }
    public double pow(double a, double b){
        if (a<0){
            System.out.println("Число отрицательное");
        }
        double result5 = Math.pow(a, b);
        return result5;
    }
    public int abs(int a){
        int result6 = Math.abs(a);
        return result6;
    }
    public double sqrt(double a){
        Math.sqrt(a);
        double result7 = a;
        return result7;
    }

}
