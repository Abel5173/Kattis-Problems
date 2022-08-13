import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != -1) {
            long TS = 0, temp = 0;
            for (int i = 0; i < n; i++) {
                long s = sc.nextLong();
                long t = sc.nextLong();
                if (i == 0) {
                    TS = s * t;
                    temp = t;
                } else {
                    temp = t - temp;
                    TS += s * temp;
                    temp = t;
                }
            }
            System.out.println(TS + " miles");
        }
    }
}
