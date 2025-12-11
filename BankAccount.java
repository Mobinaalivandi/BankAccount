public class BankAccount {
    private int accountNumber;
    private  String ownerName;
    private double balance;
    private double amount;
    BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance ;

    }

    public String getownerName() {
        return ownerName;
    }

    public int getaccountNumber() { return accountNumber; }

    public double getbalance() { return balance;}

    public void setownerName(String ownerName) { this.ownerName = ownerName;}
    public double getamount() {
        return amount;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(" deposit amount is : " + balance);
        } else {
            System.out.println("this amount is not acceptable");
        }
    }
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
            System.out.println("withdrawal amount is : " + balance);
        } else {
            System.out.println("balance is not enough");
        }
    }
    public void printBalance() {

        System.out.println("current balance is : " + balance);
    }
}








