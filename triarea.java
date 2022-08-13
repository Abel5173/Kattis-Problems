import java.util.Scanner;

public class triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), h = sc.nextInt();
        double A = 0.5 * (b * h);
        // System.out.println(A);
        System.out.printf("%.7f", A);
        sc.close();
    }
}
