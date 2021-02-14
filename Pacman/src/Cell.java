import Geometry.Point;

public class Cell {
    Point topLeft;
    Point bottomLeft;
    Point topRight;
    Point bottomRight;

    public Cell(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.bottomLeft = new Point(topLeft.getX(), bottomRight.getY());
        this.topRight = new Point(bottomRight.getX(), topLeft.getY());

    }
}
