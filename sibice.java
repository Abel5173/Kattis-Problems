import java.net.SocketTimeoutException;
import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), W = sc.nextInt(), H = sc.nextInt();
        double b = Math.sqrt((W * W) + (H * H));
        for (int i = 0; i < N; i++) {
            double a = sc.nextDouble();
            if (a <= b) {
                System.out.println("DA");
            } else
                System.out.println("NE");
        }
    }
}
