package Task4;

import java.util.ArrayList;
import java.util.List;

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */

public class Task4 {
    public static String[][] arr = new String[][] {
            {"1", "a", "1.5"},
            {"1", "b", "1.5"},
            {"1", "c", "1.5"}
    };

    public static double sum2d(String[][] arr) {

        double sum = 0;
        List<Point2d> points = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 3 || arr[i].length != 3) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e) {
                    points.add(new Point2d(i, j));
                }
            }
        }

        if (!points.isEmpty())
            throw new MyArrayDataException(points);

        return sum;
    }
}

