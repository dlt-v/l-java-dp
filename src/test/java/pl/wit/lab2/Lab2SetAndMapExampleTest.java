package pl.wit.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2SetAndMapExampleTest {

//    @Test
//    public void printMapToLog() {
//    }
//
//    @Test
//    public void printSetToLog() {
//    }

    @Test
    public void addElement() {
        Lab2SetAndMapExample obiekt = new Lab2SetAndMapExample();
        obiekt.addElement("Ala");
        obiekt.addElement("Wiek", 12);
        Integer wiek = obiekt.getMapValue("Wiek");
        Integer wartosc = 12;

        Assert.assertEquals(wiek, wartosc);
        assertTrue(obiekt.isSetContains("Ala"));

    }

    @Test
    public void getMapValue() {
        Lab2SetAndMapExample obiekt = new Lab2SetAndMapExample();
        Integer wiek = obiekt.getMapValue("Wiek");
        Integer wartosc = 12;

        Assert.assertEquals(wiek, wartosc);

    }

    @Test
    public void isSetContains() {
        Lab2SetAndMapExample obiekt = new Lab2SetAndMapExample();
        obiekt.addElement("Ala");

        assertTrue(obiekt.isSetContains("Ala"));
    }


}