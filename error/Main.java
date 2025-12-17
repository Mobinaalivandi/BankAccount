import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentnum = input.nextInt();
        int studenlessons = input.nextInt();
        input.nextLine();
        multidimensional[] array = new multidimensional[studentnum];
        for (int i = 0; i < studentnum; ++i) {
            String s = input.nextLine();
            double[] g = new double[studenlessons];
            for (int j = 0; j < studenlessons; ++j) {
                g[j] = input.nextDouble();
            }
            input.nextLine();
            array[i] = new multidimensional(s, g);
        }
        array[0].array(array);
        array[0].score(array);
        array[0].highest(array);
    }
}

