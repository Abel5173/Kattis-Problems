import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0,N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int a = s.nextInt();
            sum += Math.pow((a/10), (a%10));
        }
        System.out.println(sum);
    }
}
