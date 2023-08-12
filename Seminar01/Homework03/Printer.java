package Homework03;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
      // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length == b.length) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] == 0) {
                    throw new RuntimeException("Попытка деления на ноль");
                }
                c[i] = a[i] / b[i];
            }
            return c;
        } else {
            int[] d = new int[] {0};
            return d;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16, 25};
        b = new int[]{4, 2, 4, 0};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.divArrays(a, b));     
      System.out.println(itresume_res);
    }
}