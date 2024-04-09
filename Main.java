import java.util.Random;

class ThreadHelloWorld extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World " + i);
            try {
                Thread.sleep(new Random().nextInt(400) + 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadMultiplication extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
            try {
                Thread.sleep(new Random().nextInt(400) + 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadHelloWorld threadHelloWorld = new ThreadHelloWorld();
        ThreadMultiplication threadMultiplication = new ThreadMultiplication();

        if (new Random().nextBoolean()) {
            threadHelloWorld.start();
            threadMultiplication.start();
        } else {
            threadMultiplication.start();
            threadHelloWorld.start();
        }

        try {
            threadHelloWorld.join();
            threadMultiplication.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}