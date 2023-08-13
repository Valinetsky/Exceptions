package Task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        //Double.POSITIVE_INFINITY
        System.out.println(divideByZero(2, 0));

//        try {
//            nonExistedFile("test");
//        } catch (NonExistedFileException e) {
//            System.err.println(e.getMessage());
//        }
    }

    private static int divideByZero(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException("Это новое сообщение");
        }
        return result;
    }

    private static void nonExistedFile(String path) throws NonExistedFileException {

        try {
            FileReader reader = new FileReader(new File(path));
        } catch (IOException e) {
            throw new NonExistedFileException();
        }

    }
}
