package section2_classes_objects.exercise9;

// How can you ensure that a Customer instance can not be created without a name and an
//        initial deposit?

import section2_classes_objects.exercise9.bank.Bank;
import section2_classes_objects.exercise9.bank.BankManager;

public class Customer {
    private String name;
    private float deposit;

    public Customer(String name, float deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public void accessBankVault(Bank bank) {
//        bank.accessVault(); // If you uncomment this method (remove // from beginning of this line),
//        you'll have an error because bank.accessVault() is package protected & customer is not in the bank package
    }

    public void accessBankVault(BankManager manager, Bank bank) {
        manager.accessVault(bank);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("hans", 100.00f);
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank); // This way won't work. cmd/ctrl-click on .accessBankVault to see why
        customer.accessBankVault(manager, bank); // This way DOES work because manager IS allowed to access Bank.accessVault()

    }

}
