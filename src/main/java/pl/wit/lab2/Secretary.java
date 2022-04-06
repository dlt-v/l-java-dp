package pl.wit.lab2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Secretary extends Employee {
    private Set<String> Languages = null;

    public Secretary(String firstName, String lastName, Date dateOfBirth, Date employmentFrom, Date employmentTo, BigDecimal salaryFrom, BigDecimal salaryTo, Set<String> Languages) {
        super(firstName, lastName, dateOfBirth, employmentFrom, employmentTo, salaryFrom, salaryTo);
        this.Languages = Languages;
    }

    public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, Date employmentFrom, Date employmentTo, BigDecimal salaryFrom, BigDecimal salaryTo, Set<String> Languages) {
        if (Languages != null && !this.Languages.contains(Languages)) return false;

        return super.matches(firstName, lastName, birthFrom, birthTo, employmentFrom, employmentTo, salaryFrom, salaryTo);
    }
}
