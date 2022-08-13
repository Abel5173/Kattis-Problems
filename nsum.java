import java.util.Scanner;

public class nsum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }
}