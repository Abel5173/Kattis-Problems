import java.util.Scanner;

public class chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a + " " + (b * (b + 1) / 2 + b));
        }
        sc.close();
    }
}
