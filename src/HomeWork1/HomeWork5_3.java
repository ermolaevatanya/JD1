package HomeWork1;

import java.util.Scanner;

public class HomeWork5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите ваше имя:");
        final String name = scanner.nextLine();
        final String friend = "Вася";
        final String girlfriend = "Анастасия";
        switch (name) {
            case friend:
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case girlfriend:
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }

}
