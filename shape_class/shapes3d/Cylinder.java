package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle {
    private double hight ;

    public Cylinder(double radius , double hight) {
        super(radius);
        this.hight = hight;
    }

    @Override
    public double area() {
        return 2*super.area() + hight * super.perimeter();
    }
    public double volume(){
        return super.area() * hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight + super.toString()+
                '}';
    }
}
