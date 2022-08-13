import java.util.Scanner;

public class romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double c = 5280, d = 4854;
        double RP = (c / d) * 1000;
        int a = (int) Math.round(x * RP);
        System.out.println(a);
        sc.close();
    }
}
