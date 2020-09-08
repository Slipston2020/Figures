public class Sphere extends Point3D {
    int r;
    FigureTypes type = FigureTypes.SPHERE;

    public Sphere(int x, int y, int z, int r) {
        super(x, y, z);
        this.r = r;

    }
}
