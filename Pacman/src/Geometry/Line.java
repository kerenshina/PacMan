package Geometry;
import java.lang.Math;

public class Line {
    Point start;
    Point end;
    double length;
    float slope;

    public Line (Point start, Point end) {
        this.start = start;
        this.end = end;
        setLength();
        setSlope();
    }

    public Line (int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
        setLength();
        setSlope();
    }

    public Line (float x1, float y1, float x2, float y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
        setLength();
        setSlope();
    }

    private void setLength () {
        this.length = Math.sqrt(Math.pow(end.getX()-start.getX(), 2) + Math.pow(end.getY()- start.getY(), 2));
    }

    public double getLength() {
        return length;
    }

    private void setSlope() {
        this.slope = (end.getY() - start.getY()) / (end.getX() - start.getX());
    }
}
