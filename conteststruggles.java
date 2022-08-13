import java.util.Scanner;

class conteststruggles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), k = sc.nextDouble();
        double d = sc.nextDouble(), s = sc.nextDouble();
        double x = n * d;
        double y = k * s;
        double z = (x - y) / (n - k);
        if (z > 100 || z < 0)
            System.out.println("impossible");
        else
            System.out.printf("%.7f", z);
    }
}
