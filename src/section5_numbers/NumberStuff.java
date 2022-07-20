package section5_numbers;

public class NumberStuff {
    public static void main(String[] args) {
        byte myByte = 13;
        boolean myFlag = true;
        short myBigShort = 45;
        char myA = 'A'; //65
        double myDouble = 3.141592;
        float myFloat = 3.141592f;
        byte anotherByte = 0x1f;
        int binary = 0b010101010;

        double num1 = 2.15;
        double num2 = 1.10;
        System.out.println(num1 - num2);
        float num3 = 2.15f;
        float num4 = 1.10f;
        System.out.println(num3 - num4);


        int num8 = 7; // primitive int
        Integer num1B = Integer.valueOf(num8); // wrapper class of Integer
        Double myDouble2 = Double.valueOf("123.12");
        Float myFloat2 = Float.valueOf("23.23f");
        Byte myByte2 = Byte.valueOf("23");
        myDouble2.isNaN(); // checks if content is Not-a-Number
        storeData(num8);

        double amount = Double.parseDouble("37");
        boolean flag = Boolean.parseBoolean("true");
        System.out.println(flag);

        int age = Integer.parseInt(args[0]);
        System.out.printf("You will be %d years of age in 15 years.%n", age + 15);
    }

    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object obj){
        // so something with obj
    }
}
