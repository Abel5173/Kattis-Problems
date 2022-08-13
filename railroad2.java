import java.util.Scanner;

public class railroad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int a = 4 * x, b = 3 * y;
        if ((a + b) % 2 == 0)
            System.out.println("possible");
        else
            System.out.println("impossible");

        sc.close();
    }
}
