package pl.wit.lab2;

import java.util.Date;

public class Person {
    private String firstName = null;
    private String lastName = null;
    private Date dateOfBirth = null;

    public Person (String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo) {
        if (firstName != null && !firstName.isEmpty()) {
            if (!firstName.equals(this.firstName)) return false;
        }
        if (lastName != null && !lastName.isEmpty()) {
            if (!lastName.equals(this.lastName)) return false;
        }
        if (birthFrom != null) {
            if (birthFrom.compareTo(this.dateOfBirth) > 0) return false;
        }
        if (birthTo != null) {
            return birthTo.compareTo(this.dateOfBirth) >= 0;
        }
        return true;

    }
    // ?????
    public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, boolean strict) {
        if (firstName != null && !firstName.isEmpty()) {
            if (!firstName.equals(this.firstName)) return false;
        } else if (strict) {

        }
        if (lastName != null && !lastName.isEmpty()) {
            if (!lastName.equals(this.lastName)) return false;
        }
        if (birthFrom != null) {
            if (birthFrom.compareTo(this.dateOfBirth) > 0) return false;
        }
        if (birthTo != null) {
            return birthTo.compareTo(this.dateOfBirth) >= 0;
        }
        return true;

    }

}
