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
    double sum = 0;
    public void deposit(double amount) {
        sum = amount + balance;
        System.out.println(sum);
    }
    double subtract = 0;
    public void withdraw(double amount) {
        if (balance >= amount) {
            subtract = balance - amount;
            System.out.println(subtract);
        }
    }
    public void printBalance() {
        System.out.println(balance);
    }
}


