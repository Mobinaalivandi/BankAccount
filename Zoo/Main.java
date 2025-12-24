package Animals;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String[] list = {"dog", "cat", "bird", "lion", "elephant", "monkey"};
        ArrayList<Zoo> animals = new ArrayList<>();
        while (animals.size() <= 7 ) {
            String name = input.nextLine();
            String type = input.nextLine();
            boolean find = false;
            for ( int i = 0 ; i < list.length ; ++ i ) {
                if (type.equals(list[i])) {
                    find = true;
                    break;
                }
            }
            if(!find) {
                System.out.println("This type is not acceptable !");
                continue;
            }
            int age = input.nextInt();
            input.nextLine();
            if ( age < 0) {
                System.out.println("This age is not acceptable !" );
                continue;
            }
            double weight = input.nextDouble();
            input.nextLine();
            if ( weight <= 0 ) {
                System.out.println( "This weight is not acceptable !");
                continue;
            }
            Zoo s = new Zoo( name , age , weight , type);
            animals.add(s);
        }
    }
}
