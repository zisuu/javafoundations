package section10_streams_and_lambdas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends Employee {

    private int orgSize = 0;
    private int dr = 0;

    private final String mgrRegex = "\\w+\\=(?<orgSize>\\w+)\\,\\w+\\=(?<dr>\\w+)";
    private final Pattern mgrPat = Pattern.compile(mgrRegex);

    public Manager(String personText) {
        super(personText);
        Matcher mgrMat = mgrPat.matcher(peopleMat.group("details"));
        if (mgrMat.find()) {
            this.orgSize = Integer.parseInt(mgrMat.group("orgSize"));
            this.dr = Integer.parseInt(mgrMat.group("dr"));
        }
    }

    public int getSalary() {
        return 3500 + orgSize * dr;
    }
}
