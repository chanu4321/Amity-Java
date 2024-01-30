import java.util.*;
import java.io.*;
class Time {
    int hr,min,sec;
    Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    Time add(Time t1,Time t2){
        Time t3 = new Time(0, 0, 0);
        t3.sec=t1.sec+t2.sec;
        t3.min=t1.min+t2.min;
        t3.hr=t1.hr+t2.hr;
        if (t3.sec>=60){
            t3.sec=00;
            t3.min++;
        }
        if (t3.min>=60){
            t3.min=00;
            t3.hr++;
        }
        return t3;
    }
    void display(){
        System.out.print("Total Time: " + hr + ":" + min + ":" + sec);
    }
};
public class Q4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time t1 := ");
        int h1,m1,s1;
        h1=sc.nextInt();
        m1=sc.nextInt();
        s1=sc.nextInt();
        Time t1=new Time(h1,m1,s1);
        System.out.println("enter time t2 := ");
        int h2,m2,s2;
        h2=sc.nextInt();
        m2=sc.nextInt();
        s2=sc.nextInt();
        Time t2=new Time(h2,m2,s2);

        Time t3=new Time(0, 0, 0);
        t3=t3.add(t1, t2);
        t3.display();
    }
}
