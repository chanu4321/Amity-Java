class Geometry {
    // Area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of a square
    int calculateArea(int side) {
        return side * side;
    }

    // Area of a triangle
    double calculateArea(double base, double height, char ch) {
        return 0.5 * base * height;
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        
        // Calculate and print the area of a circle with radius 5
        System.out.println("Area of Circle: " + g.calculateArea(5.0));

        // Calculate and print the area of a rectangle with length 4 and breadth 6
        System.out.println("Area of Rectangle: " + g.calculateArea(4, 6));

        // Calculate and print the area of a square with side 3
        System.out.println("Area of Square: " + g.calculateArea(3));

        // Calculate and print the area of a triangle with base 4 and height 7
        System.out.println("Area of Triangle: " + g.calculateArea(4, 7, 't'));
    }
}
