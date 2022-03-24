package pl.wit.lab1;

import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {


    @org.junit.Test
    public void shiftXTest() {
        Point pt = new Point(1,1);
        pt.shiftX(2);
        Assert.assertEquals(3.0, pt.getX(), 0.01);
    }


    @org.junit.Test
    public void shiftYTest() {
        Point pt = new Point(1,1);
        pt.shiftY(2);
        Assert.assertEquals(3.0, pt.getY(), 0.01);
    }


    @org.junit.Test
    public void sumTest() {
        Point pt = new Point(1,1);
        pt.sum(2, 2);
        Assert.assertEquals(3.0, pt.getY(), 0.01);
        Assert.assertEquals(3.0, pt.getX(), 0.01);
    }


    @org.junit.Test
    public void subtractTest() {
        Point pt = new Point(1,1);
        pt.subtract(2, 2);
        Assert.assertEquals(-1.0, pt.getY(), 0.01);
        Assert.assertEquals(-1.0, pt.getX(), 0.01);
    }


    @org.junit.Test
    public void getRefTest() {
        Point pt = new Point(1,1);
        Point ref = pt.getRef(2, 2);
        Assert.assertEquals(3.0, ref.getY(), 0.01);
        Assert.assertEquals(3.0, ref.getX(), 0.01);
    }
}