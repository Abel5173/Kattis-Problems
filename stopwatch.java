import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 != 0)
            System.out.println("still running");
        else {
            int[] a = new int[N];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int m = 0, j = 0;
            while (j < N) {
                int b = a[j + 1] - a[j];
                m += b;
                j += 2;
            }
            System.out.println(m);
            sc.close();
        }
    }
}
