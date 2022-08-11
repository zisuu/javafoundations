package section9_collections;

import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;


public class PeopleMatchingSet {
    public static void main(String[] args) {
        String peopleText = """
        Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
        Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
        Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
        Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
        Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
        Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
        Flinstone, Fred, 1/1/1900, Programmerzzzzz, {locpd=2000,yoe=10,iq=140}
        Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=10,iq=100}
        Flinstone3, Fred, 1/1/1900, Programmer, {locpd=2300,yoe=10,iq=105}
        Flinstone4, Fred, 1/1/1900, Programmer, {locpd=1630,yoe=10,iq=115}
        Flinstone5, Fred, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
        Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
        Rubble2, Barney, 2/2/1905, Manager, {orgSize=100,dr=4}
        Rubble3, Barney, 2/2/1905, Manager, {orgSize=200,dr=2}
        Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
        Rubble5, Barney, 2/2/1905, Manager, {orgSize=175,dr=20}
        Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
        Flinstone2, Wilma, 3/3/1910, Analyst, {projectCount=4}
        Flinstone3, Wilma, 3/3/1910, Analyst, {projectCount=5}
        Flinstone4, Wilma, 3/3/1910, Analyst, {projectCount=6}
        Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
        Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
        """;

        Matcher peopleMat = Employee.PEOPLE_PAT.matcher(peopleText);

        int totalSalaries = 0;
        IEmployee employee = null;
        Set<IEmployee> employees = new LinkedHashSet<>();
        while (peopleMat.find()) {
            employee = Employee.createEmployee(peopleMat.group());
            employees.add(employee);
        }

        for (IEmployee worker : employees) {
            System.out.println(worker.toString());
            totalSalaries += worker.getSalary();
        }
        NumberFormat formatMoney = NumberFormat.getCurrencyInstance();
        System.out.printf("The total payout should be %s%n", formatMoney.format(totalSalaries));
        System.out.println(employees.size());
    }

    private static void removeUndesirables(List<IEmployee> employees, List<String> removalNames) {
        for (Iterator<IEmployee> it = employees.iterator(); it.hasNext();) {
            IEmployee worker = it.next();
//            if (worker instanceof  Employee) {
//                Employee tmpWorker = (Employee) worker;
//                if (removalNames.contains(tmpWorker.firstName)) {
//                    it.remove();
//                }
//            }
            // with pattern-Matching:
            if (worker instanceof  Employee tmpWorker) {
                if (removalNames.contains(tmpWorker.firstName)) {
                    it.remove();
                }
            }
        }
    }


}
