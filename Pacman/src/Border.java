import Geometry.Line;
import Geometry.Point;

public class Border {
    Line borderLine;

    public Border (Point start, Point end) {
        this.borderLine = new Line (start, end);
    }

    public Border (Line line) {
        this.borderLine = line;
    }
}
