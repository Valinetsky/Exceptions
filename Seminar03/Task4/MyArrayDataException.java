package Task4;

import java.util.List;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super(String.format("В ячейке [%s][%s] лежит не число", i, j));
    }

    public MyArrayDataException(List<Point2d> points) {
        super(String.format("В ячейках %s лежат не числа", points));
    }
}
