public class Rectangle extends Square {

    int dim2;
    FigureTypes type = FigureTypes.RECTANGLE;

    public Rectangle(int x, int y, int dim, int dim2){

        super(x, y, dim);
        this.dim2 = dim2;

    }

}
