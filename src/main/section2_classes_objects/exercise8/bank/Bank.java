package section2_classes_objects.exercise8.bank;

// Model a Bank with the ability to access the vault. Model a BankManager and a Customer
//too. Ensure the Customer can not access the Bank’s vault directly but the BankManager
//can.

public class Bank {
    private String name;
    void accessVault(){
        System.out.println("You're in the vault now");
    }
}
