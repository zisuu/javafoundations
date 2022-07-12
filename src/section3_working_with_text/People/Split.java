package section3_working_with_text.People;

public class Split {
    public static void main(String[] args) {
        String text = """
                Snith,Fred,1/1/79,1111 ABC St.,Apple,CA
                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
                Flintstone,Fred,3/3/81,3333 GHI St.,Peer,MO
                Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
                Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NV
                """;
        String[] people = text.split("\n");
        System.out.println(people.length);
        System.out.println(people[4]);
        String[] george = people[4].split(",");
        System.out.println(george[3]);

        String[] people2 = text.split("\n", 3);
        System.out.println(people2[2]);
    }
}
