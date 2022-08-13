import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        double v = sc.nextDouble();
        v = Math.toRadians(v);
        int ladder = (int) Math.ceil(h / (Math.sin(v)));
        System.out.println(ladder);
        sc.close();
    }
}
