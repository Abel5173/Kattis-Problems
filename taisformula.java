import java.util.Scanner;

public class taisformula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double area = 0, c = 0, d = 0;
        for (int i = 0; i < a; i++) {
            double t = sc.nextDouble(), v = sc.nextDouble();
            if (i == 0) {
                c = t;
                d = v;
            }
            area += ((((d + v) / 2)) * (t - c)) / 1000;
            c = t;
            d = v;
        }
        System.out.printf("%.6f", area);
    }
}