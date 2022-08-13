import java.util.Scanner;

public class filip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ra = 0, rb = 0;
        int a = s.nextInt(), b = s.nextInt();
        while (a != 0) {
            int remainder = a % 10;
            ra = (ra * 10) + remainder;
            a /= 10;
        }
        while (b != 0) {
            int remainder = b % 10;
            rb = (rb * 10) + remainder;
            b /= 10;
        }
        if (ra > rb)
            System.out.println(ra);
        else
            System.out.println(rb);
        s.close();
    }
}