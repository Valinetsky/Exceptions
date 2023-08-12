package Seminar02;

import java.util.Scanner;

public class Homework04 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        System.out.println(suggestInputTerm());
    }

    public static String suggestInputTerm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();
        if (message.trim().length() == 0) {
            throw new RuntimeException("| Сообщение не должно быть пустой строкой.");
        }
        return message;
    }
}