import java.util.*;
import java.io.*;
abstract class abc{
        final int pi = 3;
        abstract void sum(int x,int y);
        void show(){
            System.out.println("1");
        }
    }
class Sum extends abc {
    void sum(int x, int y){
        System.out.print("sum: ");        
        System.out.println(x+y);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Sum a1 = new Sum();
        a1.sum(5, 7);
        a1.show();
        a1.pi=4;
    }
}