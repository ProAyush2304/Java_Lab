import java.util.Scanner;

// Point class
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

// Circle class using Point object
class Circle {
    double radius;
    Point center;  // Point object

    Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayCircle() {
        System.out.println("Radius: " + radius);
        center.displayPoint();
        System.out.println("Area: " + calculateArea());
    }
}

// Main class
public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Create objects
        Point p = new Point(x, y);
        Circle c = new Circle(r, p);

        // Display details
        System.out.println("\nCircle Details:");
        c.displayCircle();

        sc.close();
    }
}