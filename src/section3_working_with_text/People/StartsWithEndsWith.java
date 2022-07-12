package section3_working_with_text.People;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String filename = "myfile.txt";
        System.out.println(filename.endsWith("txt")); // true
        System.out.println(filename.endsWith(".txt")); // true
        System.out.println(filename.endsWith(".pdf")); // false
        String filename2 = "file001.txt";
        System.out.println(filename2.startsWith("file")); // true
        String filename3 = "  file001.txt";
        System.out.println(filename3.startsWith("file")); // false
        System.out.println(filename3.strip().startsWith("file")); // true
    }
}
