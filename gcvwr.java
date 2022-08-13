import java.util.Scanner;

public class gcvwr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt(), T = sc.nextInt(), N = sc.nextInt();
        int I, TI = 0;
        int TC = G - T;
        int X = (int) (TC * 0.9);
        for (int i = 0; i < N; i++) {
            I = sc.nextInt();
            TI += I;
        }
        System.out.println(X - TI);
    }
}
