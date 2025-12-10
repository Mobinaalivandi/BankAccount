import java.util.Scanner;
import java.util.Random;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        BankAccount su = new BankAccount();
        double amount = input.nextDouble();
        int x = input.nextInt();
        amount = amount*x;
        int[] id = new int[x];
        for (int j = 0; j < x; ++j) {
            id[j] = ran.nextInt(899999) + 1000000;
        }
        BankAccount[] list = new BankAccount[x];
        System.out.println("History :");
        for (int i = 0; i < x; ++i) {
            String ownerName = input.next();
            Date m = new Date();
            int c = i + 1;
            System.out.println("Account number" + " " + c + " " + "is created");
            System.out.printf("Date and time of creation : %tD , %tT ", m, m);
            int accountNumber = ran.nextInt(899999) + 1000000;
            for (int k = 0; k < i; ++k) {
                if (accountNumber == id[k]) {
                    accountNumber = ran.nextInt(899999) + 1000000;
                }
            }
            id[i] = accountNumber;
            BankAccount s = new BankAccount(accountNumber, ownerName, 0);
            list[i] = s;
            System.out.println("\n" + "Account's owner name : " + " " + list[i].getownerName());
            System.out.println("Account's id:" + " " + list[i].getaccountNumber());
        }
        System.out.println("\n" + "number of created accounts" + " " + "is" + " " + x);
        System.out.println("the overall amount that was diposited : " + amount);
    }
}




