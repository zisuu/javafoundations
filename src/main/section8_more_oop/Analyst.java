package section8_more_oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyst extends EmployeeV2 {
    private int projectCount = 0;

    private final String analystRegex = "\\w+\\=(?<projectCount>\\w+)";
    private final Pattern analystPat = Pattern.compile(analystRegex);


    public Analyst(String personText) {
        super(personText);
        Matcher analystMat = analystPat.matcher(peopleMat.group("details"));
            if (analystMat.find()) {
                this.projectCount = Integer.parseInt(analystMat.group("projectCount"));
            }
    }


    public int getSalary() {
        return 3500 + projectCount * 2;
    }
}
