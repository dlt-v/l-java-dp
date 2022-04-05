package pl.wit.lab2;

import java.util.Arrays;

public class Lab2ArraysExample {
    private int intNumbers[] = null;
    private String stringElements[] = null;
    private Boolean boolElements[] = null;

    private Lab2ArraysExample () {
        intNumbers = new int[0];
        stringElements = new String[0];
        boolElements = new Boolean[0];
    }

    private Lab2ArraysExample (int intValue) {
        this();
        intNumbers = Arrays.copyOf(intNumbers, 1);
        intNumbers[0] = intValue;
    }

    private Lab2ArraysExample (String stringValue) {
        this();
        stringElements = Arrays.copyOf(stringElements, 1);
        stringElements[0] = stringValue;
    }

    private Lab2ArraysExample (Boolean boolValue) {
        this();
        boolElements = Arrays.copyOf(boolElements, 1);
        boolElements[0] = boolValue;
    }

    public int[] getIntNumbers() {
        return intNumbers;
    }

    public void setIntNumbers(int[] intNumbers) {
        this.intNumbers = intNumbers;
    }

    public String[] getStringElements() {
        return stringElements;
    }

    public void setStringElements(String[] stringElements) {
        this.stringElements = stringElements;
    }

    public Boolean[] getBoolElements() {
        return boolElements;
    }

    public void setBoolElements(Boolean[] boolElements) {
        this.boolElements = boolElements;
    }
}
