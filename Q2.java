import java.util.*;
import java.io.*;
public class Q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit: ");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int a[] = new int[n];
        float sum = 0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        float avg = sum/n;
        System.out.println("avg: " + avg);
    }
}
