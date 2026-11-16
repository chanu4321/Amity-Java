public class Q1A {
    public static void main(String[] args) {
        // 1. Extending Thread class
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread via Thread class");
            }
        };
        t1.start();

        // 2. Using Runnable (lambda expression)
        Thread t2 = new Thread(() -> System.out.println("Thread via Runnable lambda"));
        t2.start();
    }
}