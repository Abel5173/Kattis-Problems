import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println((long) Math.abs((a - b)));
        }
        sc.close();
    }
}
