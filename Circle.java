import java.util.Scanner;

class Point {
    int x;
    int y;
}

public class Circle {
    float radius;
    Point p;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.p = new Point();

        System.out.println("Enter x coordinate:");
        c.p.x = sc.nextInt();

        System.out.println("Enter y coordinate:");
        c.p.y = sc.nextInt();

        System.out.println("Enter radius:");
        c.radius = sc.nextFloat();

        float area = (float)(Math.PI * c.radius * c.radius);

        System.out.println("Point: (" + c.p.x + "," + c.p.y + ")");
        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + area);
    }
}