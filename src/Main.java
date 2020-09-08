public class Main {

    public enum FigTypes{
        POINT2D, CIRCLE, SPHERE, CYLINDER, SQUARE, RECTANGLE, BOX
    }

    public static void main(String[] args) {

        Point2D point = new Point2D (2, 5);
        System.out.println(point.type);
        System.out.print ("x="+point.x+"; y="+point.y+"; count="+point.count);
        System.out.println();

        Circle circle1 = new Circle (27, 51, 35);
        System.out.println(circle1.type);
        System.out.print ("x="+circle1.x+"; y="+circle1.y+"; r = "+circle1.r+"; count="+circle1.count);
        System.out.println();

        Sphere sphere1 = new Sphere (27, 51, 35, 33);
        System.out.println(sphere1.type);
        System.out.print ("x="+sphere1.x+"; y="+sphere1.y+"; z="+sphere1.z+"; r = "+sphere1.r+"; count="+sphere1.count);
        System.out.println();

        Cylinder cylinder1 = new Cylinder (27, 51, 35, 33);
        System.out.println(cylinder1.type);
        System.out.print ("x="+cylinder1.x+"; y="+cylinder1.y+"; r="+cylinder1.r+"; h = "+cylinder1.h+"; count="+sphere1.count);
        System.out.println();

        Square square1 = new Square (27, 51, 3);
        System.out.println(square1.type);
        System.out.print ("x="+square1.x+"; y="+square1.y+"; dim="+square1.dim+"; count = "+square1.count);
        System.out.println();

        Rectangle rectangle1 = new Rectangle (27, 51, 3, 2);
        System.out.println(rectangle1.type);
        System.out.print ("x="+rectangle1.x+"; y="+rectangle1.y+"; dim="+rectangle1.dim+
                "; dim2 ="+rectangle1.dim2+"; count = "+rectangle1.count);
        System.out.println();

        Box box1 = new Box (27, 51, 3, 2, 5);
        System.out.println(box1.type);
        System.out.print ("x="+box1.x+"; y="+box1.y+"; dim="+box1.dim+
                "; dim2 ="+ box1.dim2+"; h ="+box1.h+"; count = "+box1.count);
        System.out.println();
    }
}
