package HomeWork1;

public class HomeWork2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 5 + 2 / a; // 5+0.25=5.25 сначала выполняется деление
        System.out.println(c);
        int d = (5 + 2) / a; // 7/8=0.875 сначала выполняется сложение
        System.out.println(d);
        int e = (5 + b++) / a; // (5+3)/8 = 8/8 = 1 сначала выполняется сложение, далее деление
        System.out.println(e);
        int f = (5 + b++) / --a; // (5+3)/7 = 8/7 сначала выполняется постинкремент, далее сложение и деление
        System.out.println(f);
        int g = (5 * 2 >> b++) / --a; //(00001010 >> 3) / 7 == 00000001 / 7 сначала выполняется постикремент,далее умножение, далее сдвиг справо, далее деление
        System.out.println(g);
        int h = ((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a); // (12>20?6.18 >> 3) / 7 == 0 сначала выполняется постинкремент, далее деление и умножение, далее сложение, далее сдвиг вправо, далее > и ? и деление на --а
        System.out.println(h);
        //int i = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; ошибка компиляции
        //System.out.println(i);
        boolean j = 6 - 2 > 3 && 12 * 12 <= 119; //  4>3 && 144<=199
        System.out.println(j);
        boolean k = true && false; // оператор && вернет false, т.к. оба операнда не могут быть преобразованы в true
        System.out.println(k);
    }
}
