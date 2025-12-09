public class BankAccount {
  private String accountNumber;
  private  String ownerName;
  private double balance;
    BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public String getownerName() {
        return ownerName;
    }

    public String getaccountNumber() {

        return accountNumber;
    }

    public double getbalance() {

        return balance;
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void deposit(double amount) {
        balance = amount + balance;
        System.out.println(balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(balance);
        }
    }
    public void printBalance() {
        System.out.println(balance);
    }
}

