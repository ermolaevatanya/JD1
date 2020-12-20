package HomeWork2.loops;

public class Loops_1_1_1 {
    public static void main(String[] args) {
        int [] container = new int [666];
        int mult = 1;
        for (int i = 1; i <= container.length; i++) {
            System.out.print(i);
            if (i != container.length) {
                System.out.print(" * ");
            }
            mult *= i;
        }
        System.out.print(" = " + mult);
    }
}
