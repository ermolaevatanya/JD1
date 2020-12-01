package HomeWork1;
public class HomeWork2{
    static int a = 8;
    static int b = 2;
    public static void main(String[] args) {
        int c = 5;
        int d = 7;
        int e = 20;
        int f = 68;
        int g = 22;
        int h = 6;
        int i = 3;
        int j = 12;
        int k = 119;
        boolean l = true;
        boolean m = false;
        double n = c + (double) b / a; //5+0.25=5.25 сначала выполняется деление
        System.out.println(n);
        double o = (double) (c + b) / a; //7/8=0.875 сначала выполняется сложение
        System.out.println(o);
        double p = (double) (c + b++) / a; //(5+3)/8 = 8/8  сначала выполняется сложение, далее деление
        System.out.println(p);
        double q = (double) (c + b++) / --a; //(5+3)/7 = 8/7 сначала выполняется постинкремент, далее сложение и деление
        System.out.println(q);
        double r = (double) (c * b >> b++) / --a; //(00001010 >> 3) / 7 == 00000001 / 7 сначала выполняется постикремент,далее умножение, далее сдвиг справо, далее деление
        System.out.println(r);
        double s = (double)  (c + d > e ? f : g * b >> b++) / --a; // (12>20?6.18 >> 3) / 7 сначала выполняется постинкремент, далее деление и умножен
        System.out.println(s);
        //double t = (double) (c + d > e ? f >= f : g * b >> b++) / --a; // ошибка компиляции
        //System.out.println(t);
        boolean u = h - b > i && j * j <= k; // 4>3 && 144<=199
        System.out.println(u);
        boolean v = l && m; // оператор && вернет false, т.к. оба операнда не могут быть преобразованы в true
        System.out.println(v);
    }
}