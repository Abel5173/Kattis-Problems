import java.util.Scanner;

public class datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] M = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] Day = { "Sunday ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int d = sc.nextInt(), m = sc.nextInt();
        int days = 0, gc = 2511;
        if (m != 1) {
            for (int i = 0; i < m - 1; i++) {
                days += M[i];
            }
        }
        days += d;
        gc += days - 2;
        int remainder = gc % 7;
        System.out.println(Day[remainder]);
        sc.close();
    }
}