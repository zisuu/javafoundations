package section8_more_oop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee {
    protected final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    private static  final String PEOPLE_REGEX = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    public static final Pattern PEOPLE_PAT = Pattern.compile(PEOPLE_REGEX);
    protected final Matcher peopleMat;
    protected String lastName;
    protected String firstName;
    protected LocalDate dob;
    DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    protected Employee() {
        peopleMat = null;
        lastName = "N/A";
        firstName = "N/A";
        dob = null;
    }

    protected Employee(String personText) {
        peopleMat = Employee.PEOPLE_PAT.matcher(personText);
        if (peopleMat.find()) {
            this.lastName = peopleMat.group("lastName");
            this.firstName = peopleMat.group("firstName");
            this.dob = LocalDate.from(dtFormatter.parse(peopleMat.group("dob")));
        }
    }

    public static final Employee createEmployee(String employeeText){
        Matcher peopleMat = Employee.PEOPLE_PAT.matcher(employeeText);
        if (peopleMat.matches()) {
            return switch (peopleMat.group("role")) {
                case "Programmer" -> new Programmer(employeeText);
                case "Manager" -> new Manager(employeeText);
                case "Analyst" -> new Analyst(employeeText);
                case "CEO" -> new CEO(employeeText);
                default -> new DummyEmployee();
            };
        } else {
            return new DummyEmployee();
        }
    }
    public abstract int getSalary();

    public double getBonus(){
        return getSalary() * 1.10;
    }

    @Override
    public  String toString() {
        return String.format("%s, %s: %s - %s", lastName, firstName, moneyFormat.format(getSalary()), moneyFormat.format(getBonus()));
    }

    public static final class DummyEmployee extends Employee{
        @Override
        public int getSalary() {
            return 0;
        }
    }

}
