package section3_working_with_text.exercises.ex1;

public class PersonA {
    private String firstname;
    private String lastname;

    public static void main(String[] args) {
        PersonA me = new PersonA();
        me.firstname = "johny";
        me.lastname = "depp";
        System.out.println(PersonA.storeName(me));
    }

    public static String storeName(PersonA personA){
        personA.firstname = personA.firstname.toUpperCase();
        String name = personA.firstname.concat(" ").concat(personA.lastname);
        return name;
    }
}
