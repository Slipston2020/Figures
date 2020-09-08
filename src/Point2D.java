public class Point2D {
    int x;
    int y;
    static int count=0;
    FigureTypes type = FigureTypes.POINT2D;

    public Point2D(int x, int y) {
        this.x=x;
        this.y=y;
        count=count+1;

    }
}
