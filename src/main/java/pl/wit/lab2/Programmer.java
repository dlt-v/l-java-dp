package pl.wit.lab2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class Programmer extends Employee{
    private Map<String, Short> programmingLanguages = null;

    public Programmer(String firstName, String lastName, Date dateOfBirth, Date employmentFrom, Date employmentTo, BigDecimal salaryFrom, BigDecimal salaryTo, Map<String, Short> programmingLanguages) {
        super(firstName, lastName, dateOfBirth, employmentFrom, employmentTo, salaryFrom, salaryTo);
        this.programmingLanguages = programmingLanguages;
    }

    public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, Date employmentFrom, Date employmentTo, BigDecimal salaryFrom, BigDecimal salaryTo, Map<String, Short> programmingLanguages) {
        //TODO: Add the stuff because I can't today. :(
        return super.matches(firstName, lastName, birthFrom, birthTo, employmentFrom, employmentTo, salaryFrom, salaryTo);
    }
}
