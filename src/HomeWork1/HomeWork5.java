package HomeWork1;
import java.util.Scanner;
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя:");
        String name = in.nextLine();
        if (in.hasNext("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            if (in.hasNext("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            }
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }}