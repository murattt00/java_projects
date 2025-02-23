package shapes3d;

public class TestShapes3d {
    public static void main(String[] args){
        Cylinder cl1 = new Cylinder(5.0,8.0);
        System.out.println(cl1);
        System.out.println("Area of Cl1 = " + cl1.area());
        System.out.println("Volume of Cl1 = " + cl1.volume());

        Cube cb1 = new Cube(5.0);

        System.out.println(cb1);
        System.out.println("Area of cb1 = " + cb1.area());
        System.out.println("Volume of cb1 = " + cl1.volume());
    }
}
