import java.util.Random;
class thread1 extends Thread {
    public void run() {
        Random r1=new Random();
        for(int i=0; i<5; i++){
            int n=r1.nextInt(5);
            System.out.println("Thread 1 Number: " + n);
            if(n%2==0){
                thread2 t2= new thread2();
                t2.run(n);
            }
            else{
                thread3 t3=new thread3();
                t3.run(n);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class thread2 extends Thread {
    public void run(int n){
        System.out.println("Thread 2 Square: " + n*n); 
    }
}

class thread3 extends Thread {
    public void run(int n){
        System.out.println("Thread 3 Cube: " + n*n*n); 
    }
}

public class Lab8_3 {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
    }
}