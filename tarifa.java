import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0, X = s.nextInt();
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int a = s.nextInt();
            c += (X - a);
        }
        System.out.println((c + X));
    }

}
