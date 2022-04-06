package pl.wit.lab2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person {
    private Date employmentFrom = null;
    private Date employmentTo = null;
    private BigDecimal salaryFrom = null;
    private BigDecimal salaryTo = null;

    public Employee(String firstName, String lastName, Date dateOfBirth, Date employmentFrom, Date employmentTo, BigDecimal salaryFrom, BigDecimal salaryTo) {
        super(firstName, lastName, dateOfBirth);
        this.employmentFrom = employmentFrom;
        this.employmentTo = employmentTo;
        this.salaryFrom = salaryFrom;
        this.salaryTo = salaryTo;
    }

    public boolean matches(String firstName, String lastName, Date birthFrom, Date birthTo, Date employmentFrom, Date employmentTo, BigDecimal salaryFrom, BigDecimal salaryTo) {
        if (employmentFrom != null && this.employmentFrom != employmentFrom) return false;
        if (employmentTo != null && this.employmentTo != employmentTo) return false;
        if (salaryFrom != null && !Objects.equals(this.salaryFrom, salaryFrom)) return false;
        if (salaryTo != null && !Objects.equals(this.salaryTo, salaryTo)) return false;
        return super.matches(firstName, lastName, birthFrom, birthTo);

    }
}
