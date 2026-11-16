public class Q2A {
    public static void main(String[] args) {
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2)
                System.out.println("Odd: " + i);
        });

        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2)
                System.out.println("Even: " + i);
        });

        odd.start();
        even.start();
    }
}
