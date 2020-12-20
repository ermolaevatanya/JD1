package HomeWork3;

public class CalculatorWithOperator {
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
    public double pow(double a, int b){
        if (a<0){
            System.out.println("Число отрицательное");
        }
        double result5 = 1;
        for (int i = 0; i < b; i++) {
            result5 *= a;
        }
        return result5;
    }
    public int abs(int a){
        if (a<0){
            a *= -1;
        }
        int result6 = a;
        return result6;
    }
    public double sqrt(double a){
        Math.sqrt(a);
        double result7 = a;
        return result7;
    }
}
