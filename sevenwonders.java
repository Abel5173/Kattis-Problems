import java.util.Scanner;

public class sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int T = 0, C = 0, G = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T')
                T++;
            else if (s.charAt(i) == 'C')
                C++;
            else if (s.charAt(i) == 'G')
                G++;
        }
        int a = 0;
        if (T == C && C == G) {
            a = (int) (7 * T + 3 * Math.pow(T, 2));
            System.out.println(a);
        } else {
            a = Math.min(T, (Math.min(C, G)));
            a = a * 7 + (T * T) + (C * C) + (G * G);
            System.out.println(a);
        }
    }
}
