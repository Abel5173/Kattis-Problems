import java.util.Scanner;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0) {
            int k = sc.nextInt() - 1;
            int b = 0, a = 0;
            for (int i = 0; i <= k; i++) {
                a = sc.nextInt();
                b += a;
            }
            System.out.println(b - k);
            N--;
        }
    }
}
