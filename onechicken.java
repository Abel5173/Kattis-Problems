import java.util.Scanner;

public class onechicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a = Math.abs(n - m);
        if (n < m) {
            if (a == 1)
                System.out.println("Dr. Chaz will have " + a + " piece of chicken left over!");
            else
                System.out.println("Dr. Chaz will have " + a + " pieces of chicken left over!");
        } else {
            if (a == 1)
                System.out.println("Dr. Chaz needs " + a + " more piece of chicken!");
            else
                System.out.println("Dr. Chaz needs " + a + " more pieces of chicken!");
        }

        sc.close();
    }
}