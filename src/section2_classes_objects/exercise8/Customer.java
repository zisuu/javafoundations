package section2_classes_objects.exercise8;

// Model a Bank with the ability to access the vault. Model a BankManager and a Customer
//too. Ensure the Customer can not access the Bank’s vault directly but the BankManager
//can.

import section2_classes_objects.exercise8.bank.Bank;
import section2_classes_objects.exercise8.bank.BankManager;

public class Customer {
    public void accessBankVault(Bank bank) {
//        bank.accessVault(); // If you uncomment this method (remove // from beginning of this line),
//        you'll have an error because bank.accessVault() is package protected & customer is not in the bank package
    }

    public void accessBankVault(BankManager manager, Bank bank) {
        manager.accessVault(bank);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank); // This way won't work. cmd/ctrl-click on .accessBankVault to see why
        customer.accessBankVault(manager, bank); // This way DOES work because manager IS allowed to access Bank.accessVault()

    }

}
