package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        boolean isCorrect = false;
        System.out.println("Приложение для сохранения данных о контактах пользователя.");
        System.out.println("Каждый контакт состоит из шести полей:");
        System.out.println("1. Фамилия");
        System.out.println("2. Имя");
        System.out.println("3. Отчество");
        System.out.println("   | Латинские буквы буквы из диапазона от A до z.");
        System.out.println("4. Дата рождения - в формате dd.mm.yyyy");
        System.out.println("   | dd - от 01 до 31");
        System.out.println("   | mm - от 01 до 12");
        System.out.println("   | yyyy - от 1900 до 2099");
        System.out.println("5. Номер телефона - целое беззнаковое число без форматирования");
        System.out.println("6. Пол - символ латиницей f или m");
        
        while (!isCorrect) {
            try {
                System.out.println("Введите все шесть полей контакта, разделяя их пробелами, в одной строке: ");
                Human human = new Human(iScanner.nextLine());
                TextToFileOutput writer = new TextToFileOutput();
                writer.writeContact(human);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            } catch (Error er) {
                System.err.println(er.getMessage());
            } finally {
                System.out.print("Продолжить работу? [Y/n]: ");
                String answer = iScanner.nextLine();
                if (!answer.equalsIgnoreCase("y")) {
                    isCorrect = true;
                }   
            }
        }
    }
}