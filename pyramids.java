import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        for (int i = (int) Math.sqrt(num); i > 0; i--) {
            int n = i;
            int m = num, cnt = 0;
            while (n > 0) {
                if (Math.pow(n, 2) < m) {
                    m -= (int) Math.pow(n, 2);
                    cnt++;
                } else if (m < (int) Math.pow(n, 2)) {
                    cnt++;
                    break;
                } else if (m == 1) {
                    cnt++;
                    break;
                } else if (m == (int) Math.pow(n, 2)) {
                    cnt = 0;
                    break;
                }
                n -= 2;
            }
            if (cnt > max) {
                max = cnt;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
