package Homework01;
        class Answer {
            public int[] arrayOutOfBoundsException(int a, int b, int c) {
                // Напишите свое решение ниже
                int[] arr = new int[a];
                arr[b] = c;
                return arr;
            }
        
            public int divisionByZero(int a, int b) {
                // Напишите свое решение ниже
                return a / b;
            }
        
            public int numberFormatException(String StringToNumber) {
                // Напишите свое решение ниже
                int number = Integer.parseInt(StringToNumber);
                return number;
            }
        }
        
        public class Printer {
            public static void main(String[] args) {
                Answer ans = new Answer();
                try {
                    ans.arrayOutOfBoundsException(10, 11, 1);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Выход за пределы массива");
                }
        
                try {
                    ans.divisionByZero(3, 0);
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль");
                }
        
                try {
                    ans.numberFormatException("Probe");
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования строки в число");
                }
            }
        }

