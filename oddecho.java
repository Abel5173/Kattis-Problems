import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            String str = sc.nextLine();
            if (i % 2 != 0)
                System.out.println(str);
        }
        sc.close();
    }
}
