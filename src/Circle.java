public class Circle extends Point2D {

    int r;
    FigureTypes type = FigureTypes.CIRCLE;

    public Circle(int x, int y, int r){
        super(x, y);
        this.r = r;

    }
}
