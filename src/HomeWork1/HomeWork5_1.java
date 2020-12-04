package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите ваше имя:");
        String name = scanner.nextLine();

        String friend = "Вася";
        String girlfriend = "Анастаисия";

        boolean isFriend = Objects.equals(name, friend);
        boolean isGirlFriend = Objects.equals(name, girlfriend);

        if (isFriend){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if (isGirlFriend) {
            System.out.println("Я тебя так долго ждал");
            return;
        }
        System.out.println("Добрый день, а вы кто?");
    }
}
