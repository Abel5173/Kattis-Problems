import java.util.Scanner;

public class zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), D = sc.nextInt(), X = sc.nextInt();
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = L; i <= D; i++) {
            int s = 0, n = i;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            if (X == s) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }
        System.out.println(min + "\n" + max);
        sc.close();
    }
}
