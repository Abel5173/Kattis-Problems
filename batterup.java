import java.util.Scanner;

public class batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] b = new double[n];
        double c = 0, a = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == -1)
                a++;
            else
                c += b[i];
        }
        // if (c == 0)
        // System.out.println(1 / (n - a));
        // else
        System.out.println(c / (n - a));
    }
}
