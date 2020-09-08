public class Cylinder extends Circle {

    int h;
    FigureTypes type = FigureTypes.CYLINDER;

    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }
}
