public class Square extends Point2D {

    int dim;
    FigureTypes type = FigureTypes.SQUARE;

    public Square(int x, int y, int dim){

        super(x, y);
        this.dim = dim;
    }
}
