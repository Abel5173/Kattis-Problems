import java.util.Scanner;

public class speeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = 0, T = 0, max = 0, n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(), d = sc.nextInt();
            if (t != 0 && max < ((d - D) / (t - T))) {
                max = (d - D) / (t - T);
            }
            D = d;
            T = t;
        }
        System.out.println(max);
    }
}
