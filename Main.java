import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ownerName = input.nextLine();
        double balance = input.nextDouble();
        input.nextLine();
        String accountNumber = input.nextLine();
        BankAccount s = new BankAccount(accountNumber, ownerName, balance);
        double amount = input.nextDouble();
        s.deposit(amount);
        s.withdraw(amount);
        s.printBalance();
    }
}
