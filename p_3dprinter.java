import java.util.Scanner;

public class p_3dprinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, n = sc.nextInt();
        int min = n;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                b = i / 2;
            else
                b = (int) Math.ceil(i / 2) + 1;
            if (((n / i) + 1) + b < min)
                min = ((n / i) + 1) + b;
        }
        System.out.println(min);
        sc.close();
    }
}