import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(Counter counter = new Counter()) {
            counter.add();
            System.out.println(counter.getI());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        Counter counter = new Counter();
//
//        try {
//            counter.add();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(counter.getI());
//
//        try {
//            counter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            counter.add();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(counter.getI());
    }
}
