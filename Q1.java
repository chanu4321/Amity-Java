import java.io.*;
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        System.out.println("enter string:");
        Scanner SC = new Scanner(System.in);
        String x = SC.next();
        Scanner SC_1 = new Scanner(x);
        SC_1.useDelimiter("/");
        System.out.println("all words are: ");
        while (SC_1.hasNext()) {
            System.out.println(SC_1.next());
        }
    }
}