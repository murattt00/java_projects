
public class Main {
    public static void main(String[] args) {
        Point topleft = new Point(0,20);
        Rectangle rectangle = new Rectangle(10 , 20 , topleft);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        for(int i = 0 ; i < rectangle.corners().length ;i++) {
            System.out.println(" x is " + rectangle.corners()[i].getxCoord() + " y is "+ rectangle.corners()[i].getyCoord());
        }
        Circle c1 = new Circle(5, new Point(0,0));
        Circle c2 = new Circle(7, new Point(3,4));
        System.out.println(c1.area());
        System.out.println(c1.primeter());
        if (c1.intersect(c2)){
            System.out.println("Circle1 is intersecting with Circle2");
        }else {
            System.out.println("Circle1 is NOT intersecting with Circle2");
        }
    }
}
