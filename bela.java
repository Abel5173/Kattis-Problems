import java.util.Scanner;

public class bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        String str = "";
        char s = sc.next().charAt(0);
        sc.nextLine();
        for (int i = 0; i < 4 * n; i++) {
            str = sc.nextLine();
            if ((str.charAt(0) == 'J' && str.charAt(1) == s) ||
                    (str.charAt(0) == '9' && str.charAt(1) == s)) {
                if (str.charAt(0) == 'J')
                    p += 20;
                else if (str.charAt(0) == '9')
                    p += 14;
            } else {
                switch (str.charAt(0)) {
                    case 'A':
                        p += 11;
                        break;

                    case 'K':
                        p += 4;
                        break;

                    case 'Q':
                        p += 3;
                        break;

                    case 'J':
                        p += 2;
                        break;

                    case 'T':
                        p += 10;
                        break;

                    default:
                        p += 0;
                        break;

                }
            }
        }
        System.out.println(p);
        sc.close();
    }
}
