import java.util.Scanner;

public class sumsquareddigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int a = 0;
            int k = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            while (n > 0) {
                a += (n % b) * (n % b);
                n /= b;
            }
            System.out.println(k + " " + a);
        }
        sc.close();
    }
}
