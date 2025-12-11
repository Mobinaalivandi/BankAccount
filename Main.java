import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        List<BankAccount> list = new ArrayList<>();
        ArrayList<String> history = new ArrayList<>();
        HashSet<Integer> usedIds = new HashSet<>();
        while (true) {
            System.out.println("1. make a account");
            System.out.println("2. get the history");
            System.out.println("3. withdraw money");
            System.out.println("4. deposit money");
            System.out.println("5. print balance");
            System.out.println("0. exit");
            int x = input.nextInt();
            if (x == 0) {
                System.out.println("quit");
                break;
            } else if (x == 1) {
                for (int i = 0; i < x; ++i) {
                    input.nextLine();
                    String ownerName = input.nextLine();
                    int accountNumber = ran.nextInt(900000) + 100000;
                    while (usedIds.contains(accountNumber)) {
                        accountNumber = ran.nextInt(900000) + 100000;
                    }
                    usedIds.add(accountNumber);
                    BankAccount s = new BankAccount(accountNumber, ownerName, 0);
                    list.add(s);
                    Date date = new Date();
                    String datee = String.format("%tD  %tT ", date, date);
                    history.add("User's name :" + ownerName + " " + "User's id : " + accountNumber + " " + "Time and date of creation:" + datee);
                    System.out.println("User's name :" + list.get(i).getownerName());
                    System.out.println("User's id : " + list.get(i).getaccountNumber());
                }
            } else if (x == 2) {
                System.out.println("\n The number of created accounts" + " " + history.size());
                for (String s : history) {
                    System.out.println(s);
                }
            } else if (x == 3) {
                System.out.print("enter your account id : ");
                int id = input.nextInt();
                if (usedIds.contains(id)) {
                    for (int j = 0; j < x; ++j) {
                        if (id == list.get(j).getaccountNumber()) {
                            int mon = input.nextInt();
                            list.get(j).withdraw(mon);
                            Date date = new Date();
                            String datee = String.format("%tD  %tT ", date, date);
                            history.add("User's name :" + list.get(j).getownerName() + " " + "User's id : " + list.get(j).getaccountNumber() + " " + "Time and date of creation:" + datee + " " + " the amount that was withdrawn : " + mon);

                        }
                    }
                }else {
                    System.out.print("id not found");
                }
            } else if (x == 4) {
                System.out.print("enter your account id : ");
                int id = input.nextInt();
                if (usedIds.contains(id)) {
                    for (int j = 0; j < x; ++j) {
                        if (id == list.get(j).getaccountNumber()) {
                            int mon = input.nextInt();
                            list.get(j).deposit(mon);
                            Date date = new Date();
                            String datee = String.format("%tD  %tT ", date, date);
                            history.add("User's name :" + list.get(j).getownerName() + " " + "User's id : " + list.get(j).getaccountNumber() + " " + "Time and date of creation:" + datee + " " + " the amount that was deposited : " + mon);
                        }
                    }
                } else {
                    System.out.print("id not found");
                }
            }
        }
    }
}






