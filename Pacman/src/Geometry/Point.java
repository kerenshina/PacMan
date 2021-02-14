package Geometry;

public class Point {
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point (int x, int y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
