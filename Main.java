import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Owner's name :");
        String ownerName = input.nextLine();
        System.out.println("Initial balance");
        double balance = input.nextDouble();
        System.out.println("Accountsnumber :");
        input.nextLine();
        String accountNumber = input.nextLine();
        BankAccount s = new BankAccount(accountNumber, ownerName, balance);
        System.out.println("the amount is :");
        double amount = input.nextDouble();
        s.deposit(amount);
        s.withdraw(amount);
        s.printBalance();
    }
}
