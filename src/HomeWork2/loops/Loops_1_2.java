package HomeWork2.loops;

public class Loops_1_2 {
    public static void main(String[] args) {
        int i = 55556;
        int mult = 1;
        int reversedI = 1;
        while (i != 0) {
            reversedI = reversedI * 10 + i % 10;
            i = i / 10;
        }
        while (reversedI > 1){
            System.out.print(reversedI % 10);
            mult = mult * (reversedI % 10);
            reversedI = reversedI / 10;
            if (reversedI > 1) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + mult);
    }
}
