import java.util.Scanner;

class ggg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a;
        while ((a = input.nextLong()) != -1) {
            long b = input.nextLong();
            long d = input.nextLong();
            long c = gcd(a, b);
            long lc = (a * b) / c;
            long e = gcd(lc, d);
            System.out.println(lc * d / e);
        }
    }
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}