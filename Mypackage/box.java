package Mypackage;

public class box {
    private double l,b,d;

    public box(double l,double b,double d){
        this.l=l;
        this.b=b;
        this.d=d;
    }
    public void volume() {
        System.out.println(l*b*d);
    }
    public void display() {
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
        System.out.println("Depth: " + d);
        System.out.println("Volume: ");
        volume();
    }
}
