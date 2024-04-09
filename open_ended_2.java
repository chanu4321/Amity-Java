import java.util.ArrayList;

class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Ellipse extends Shape {
    private double semiMajorAxis, semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double area() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    public double perimeter() {
        // Approximation using Ramanujan's formula
        double h = Math.pow(semiMajorAxis - semiMinorAxis, 2) / Math.pow(semiMajorAxis + semiMinorAxis, 2);
        return Math.PI * (semiMajorAxis + semiMinorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }
}

class Triangle extends Shape {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        return Math.abs((p1.x*(p2.y - p3.y) + p2.x*(p3.y - p1.y) + p3.x*(p1.y - p2.y)) / 2.0);
    }

    public double perimeter() {
        double side1 = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        double side2 = Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2));
        double side3 = Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
        return side1 + side2 + side3;
    }
}

class Polygon extends Shape {
    private ArrayList<Point> points;

    public Polygon(ArrayList<Point> points) {
        this.points = points;
    }

    public double area() {
        double area = 0;
        int n = points.size();
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += points.get(i).x * points.get(j).y;
            area -= points.get(j).x * points.get(i).y;
        }
        return Math.abs(area / 2.0);
    }

    public double perimeter() {
        double perimeter = 0;
        int n = points.size();
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            perimeter += Math.sqrt(Math.pow(points.get(j).x - points.get(i).x, 2) +
                                   Math.pow(points.get(j).y - points.get(i).y, 2));
        }
        return perimeter;
    }
}

public class open_ended_2 {
    public static void main(String[] args) {
        // Test dynamic polymorphism
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Circle(4);
        shapes[2] = new Square(6);
        shapes[3] = new Ellipse(5, 3);
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(4, 0));
        points.add(new Point(4, 3));
        shapes[4] = new Polygon(points);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("-------------------------");
        }
    }
}