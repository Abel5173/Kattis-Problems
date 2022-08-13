import java.util.Scanner;

public class harshadnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            if (isHarshadNumber(a)) {
                System.out.println(a);
                break;
            }

            a++;
        }
    }

    public static boolean isHarshadNumber(int a) {
        int b = 0;
        Integer c = a;
        for (int i = 0; i < c.toString().length(); i++) {
            b += (a % 10);
            a /= 10;
        }
        if (c % b == 0)
            return true;

        return false;
    }
}
