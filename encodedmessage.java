import java.util.Scanner;

public class encodedmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        while (n > 0) {
            str = sc.next();
            int ai = (int) Math.sqrt(str.length());
            int z = 0;
            char[][] c = new char[ai][ai];
            for (int a = 0; a < ai; a++) {
                for (int b = 0; b < ai; b++) {
                    if (z < str.length()) {
                        c[a][b] = str.charAt(z++);
                    } else
                        break;
                }
            }
            for (int i = (ai - 1); i >= 0; i--) {
                for (int j = 0; j < ai; j++) {
                    System.out.print(c[j][i]);
                }
            }
            System.out.println();
            n--;
        }
        sc.close();
    }
}
