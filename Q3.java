import java.util.*;
import java.io.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter limit: ");
        int n=sc.nextInt();
        System.out.println("enter elements: ");
        int a[]= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("entered elements: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
