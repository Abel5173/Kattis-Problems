import java.util.Scanner;

public class sumkindofproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            long k = sc.nextLong(), n = sc.nextLong();
            long s1 = n * (n + 1) / 2;
            long s2 = n * n;
            long s3 = n * (n + 1);
            System.out.println(k + " " + s1 + " " + s2 + " " + s3);
        }
    }
}
