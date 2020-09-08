public class Box extends Rectangle {

    int h;
    FigureTypes type = FigureTypes.BOX;x

    public Box(int x, int y, int dim, int dim2, int h){
        super(x, y, dim, dim2);
        this.h = h;
    }

}
