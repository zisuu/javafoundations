package section8_more_oop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    protected final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    private final String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    protected final Pattern peoplePat = Pattern.compile(peopleRegex);
    protected final Matcher peopleMat;
    protected String lastName;
    protected String firstName;
    protected LocalDate dob;
    DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    public Employee(String personText) {
        peopleMat = peoplePat.matcher(personText);
        if (peopleMat.find()) {
            this.lastName = peopleMat.group("lastName");
            this.firstName = peopleMat.group("firstName");
            this.dob = LocalDate.from(dtFormatter.parse(peopleMat.group("dob")));
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %s", lastName, firstName, moneyFormat.format(getSalary()));
    }

    public int getSalary() {
        return 0;
    }
}
