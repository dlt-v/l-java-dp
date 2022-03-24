package pl.wit.lab1;
/*
Class point describes an object that has two coordinates
Declared methods are for operations on these points and objects as a whole
 */
public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void subtract(float sX, float sY) {
        shiftX(sX * -1);
        shiftY(sY * -1);
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public void shiftX(float value) {
        x = x + value;
    }
    public void shiftY(float sY) {
        this.y = this.y + sY;
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
    public void sum(float sX, float sY) {
        shiftX(sX);
        shiftY(sY);
    }

    public Point getRef(float sX, float sY) {
        sum(sX, sY);
        return new Point(this.x, this.y);
    }
}
