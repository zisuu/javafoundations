package section8_more_oop;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PeopleMatchingV2 {
        public static void main(String[] args) {
            String peopleText = """
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
            Flinstone2, Fred, 1/1/1900, Programmer, {locpd=1300,yoe=10,iq=100}
            Flinstone3, Fred, 1/1/1900, Programmer, {locpd=2300,yoe=10,iq=105}
            Flinstone4, Fred, 1/1/1900, Programmer, {locpd=1630,yoe=10,iq=115}
            Flinstone5, Fred, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
            Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
            Rubble2, Barney, 2/2/1905, Manager, {orgSize=100,dr=4}
            Rubble3, Barney, 2/2/1905, Manager, {orgSize=200,dr=2}
            Rubble4, Barney, 2/2/1905, Manager, {orgSize=500,dr=8}
            Rubble5, Barney, 2/2/1905, Manager, {orgSize=175,dr=20}
            Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
            Flinstone2, Wilma, 3/3/1910, Analyst, {projectCount=4}
            Flinstone3, Wilma, 3/3/1910, Analyst, {projectCount=5}
            Flinstone4, Wilma, 3/3/1910, Analyst, {projectCount=6}
            Flinstone5, Wilma, 3/3/1910, Analyst, {projectCount=9}
            Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
            """;

            String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
            Pattern peoplePat = Pattern.compile(peopleRegex);
            Matcher peopleMat = peoplePat.matcher(peopleText);

            int totalSalaries = 0;
            Employee employee = null;
            while (peopleMat.find()) {
                employee = switch (peopleMat.group("role")) {
                    case "Programmer" -> new Programmer(peopleMat.group());
                    case "Manager" -> new Manager(peopleMat.group());
                    case "Analyst" -> new Analyst(peopleMat.group());
                    case "CEO" -> new CEO(peopleMat.group());
                    default -> new Employee(peopleMat.group());
                };
                System.out.println(employee.toString());
                totalSalaries += employee.getSalary();
            }
            NumberFormat formatMoney = NumberFormat.getCurrencyInstance();
            System.out.printf("The total payout should be %s%n", formatMoney.format(totalSalaries));
    }
}
