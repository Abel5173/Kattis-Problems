import java.util.Scanner;

public class betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.printf("%.10f \n", (100 / n));
        System.out.printf("%.10f", (100 / (100 - n)));
        sc.close();
    }
}
