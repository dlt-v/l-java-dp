package pl.wit.lab2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2ArraysExampleTest {

    Lab2ArraysExample intArray = new Lab2ArraysExample(14);
    Lab2ArraysExample stringArray = new Lab2ArraysExample("ala");
    Lab2ArraysExample boolArray = new Lab2ArraysExample(true);


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addElement() {
        intArray.addElement(14);
        boolArray.addElement(false);
        stringArray.addElement("ma");
        stringArray.addElement("kota");
        Assert.assertEquals(intArray.getIntArraySize(), 2);
        Assert.assertEquals(boolArray.getBooleanArraySize(), 2);
        Assert.assertEquals(stringArray.getStringArraySize(), 3);
    }

    @Test
    public void getIntArraySize() {
        intArray.addElement(14);
        Assert.assertEquals(intArray.getIntArraySize(), 2);
    }

    @Test
    public void getStringArraySize() {
        stringArray.addElement("ma");
        stringArray.addElement("kota");
        Assert.assertEquals(stringArray.getStringArraySize(), 3);

    }

    @Test
    public void getBooleanArraySize() {
        boolArray.addElement(false);
        Assert.assertEquals(boolArray.getBooleanArraySize(), 2);

    }

    @Test
    public void getIntArrayElement() {
        intArray.addElement(15);
        intArray.addElement(16);
        Assert.assertEquals(intArray.getIntArrayElement(2), 16);
        Assert.assertEquals(intArray.getIntArrayElement(55), -1);
    }

    @Test
    public void getStringArrayElement() {
        stringArray.addElement("ma");
        stringArray.addElement("kota");
        Assert.assertEquals(stringArray.getStringArrayElement(2), "kota");
    }

    @Test
    public void getBooleanArrayElement() {
        boolArray.addElement(false);
        boolArray.addElement(true);
        assertTrue(boolArray.getBooleanArrayElement(2));
    }
}