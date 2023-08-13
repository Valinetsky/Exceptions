package Task4;

public class Point2d {
    private  int i;
    private  int j;

    public Point2d(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", i, j);
    }
}
