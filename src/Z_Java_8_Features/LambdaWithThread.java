package Z_Java_8_Features;

public class LambdaWithThread {
    public static void main(String[] args) {

        // 1. Using Anonymous Function
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-1 is running using anonymous function...!");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        // 2. Using Lambda Function
        Runnable r2 = ()-> System.out.println("Thread-2 is running using anonymous function...!");
        Thread t2 = new Thread(r2);
        t2.start();

    }
}
