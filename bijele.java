import java.util.Scanner;

public class bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = { 1, 1, 2, 2, 2, 8 };
        for (int i = 0; i < n.length; i++) {
            int a = sc.nextInt();
            n[i] -= a;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
