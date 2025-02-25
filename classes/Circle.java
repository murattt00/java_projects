public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double area(){
        return Math.PI * (Math.pow(radius,2));
    }
    public double primeter(){
        return  2*Math.PI*radius;
    }
    public boolean intersect(Circle c) {
        return center.distance(c.getCenter()) <= radius + c.getRadius();

    }
}
