package shapes2d;

import java.io.PrintStream;

public class TestShapes2d {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        System.out.println("Area of circle = " + c1.area());
        Square s1 = new Square(5.0);
        System.out.println(s1);
        System.out.println("Area of square = " + s1);
    }
}
