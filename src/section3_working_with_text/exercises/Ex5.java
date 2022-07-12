package section3_working_with_text.exercises;

public class Ex5 {
    public static void main(String[] args) {

    String address = "12345 Big St., Alphabet City, CA 90210";

    String buildingNumber = address.split(" ")[0];
    String street = findStreet(address);
    String city = findCity(address);
    String state = findState(address);
    String postCode = findPostCode(address);

    System.out.println(buildingNumber);
    System.out.println(street);
    System.out.println(city);
    System.out.println(state);
    System.out.println(postCode);

    }

    public static String findStreet(String address){
        String street = address.split(",")[0];
        int indexStart = street.indexOf(" ");
        return street.substring(indexStart).strip();
    }

    public static String findCity(String address){
        return address.split(",")[1].strip();
    }

    public static String findState(String address){
        return address.split(",")[2].strip().split(" ")[0];
    }

    public static String findPostCode(String address){
        return address.split(",")[2].strip().split(" ")[1];
    }
}
