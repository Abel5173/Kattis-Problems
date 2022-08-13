import java.util.Scanner;

public class friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for (int j = 0; j < p; j++) {
            int D = sc.nextInt();
            int M = sc.nextInt();
            int temp = 0;
            int c = 0;
            for (int i = 0; i < M; i++) {
                int d = sc.nextInt();
                if ((temp + 13) % 7 == 6 && d > 12) {
                    c++;
                }
                temp += d;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
