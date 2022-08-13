import java.util.Scanner;

public class heartrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double b = sc.nextDouble(), p = sc.nextDouble();
            double a = (60 * b) / p - (60 / p);
            double d = (60 * b) / p;
            double c = (60 * b) / p + (60 / p);
            System.out.printf("%.4f %.4f %.4f", a, d, c);
            System.out.println();
        }
    }
}
