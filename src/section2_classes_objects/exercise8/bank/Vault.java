package section2_classes_objects.exercise8.bank;

// Model a Bank with the ability to access the vault. Model a BankManager and a Customer
//too. Ensure the Customer can not access the Bank’s vault directly but the BankManager
//can.

public class Vault {

    private String owner;
    private double saldo;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Vault(String owner, double saldo) {
        this.owner = owner;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Vault{" +
                "owner='" + owner + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
