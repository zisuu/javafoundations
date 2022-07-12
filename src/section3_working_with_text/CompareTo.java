package section3_working_with_text;

public class CompareTo {
    public static void main(String[] args) {
        String fristWord = "Apple";
        String secondWord = "Banana";
        System.out.println(fristWord.compareTo(secondWord));

        String fristWord2 = "Apple";
        String secondWord2 = "Apple";
        System.out.println(fristWord2.compareTo(secondWord2));

        String fristWord3 = "Apple";
        String secondWord3 = "Aard";
        System.out.println(fristWord3.compareTo(secondWord3));

        String fristWord4 = "Apple";
        String secondWord4 = "apple";
        System.out.println(fristWord4.compareToIgnoreCase(secondWord4));
        System.out.println(compareToIgnoreCase(fristWord4,secondWord4));
    }

    public static int compareToIgnoreCase(String text1, String text2){
        String lowertext1 = text1.toLowerCase();
        String lowertext2 = text2.toLowerCase();
        return lowertext1.compareTo(lowertext2);
    }
}
