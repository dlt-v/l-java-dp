package pl.wit.lab1;

public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public void shiftX(float value) {
        x = x + value;
    }

    public Point addNewPoint(Point pt) {
        Point pt1 = new Point(x, y);
        return null;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
