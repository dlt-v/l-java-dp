package pl.wit.lab3;

public class PersonException extends Exception{
    public PersonException(String value) {
        super(value);
    }
    public PersonException(String value, Exception exc) {
        super(value, exc);
    }
}
