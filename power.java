import java.util.Scanner;

class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 1; i <= T; i++) {
            long sum = 0;
            long mod = 0;
            int a = input.nextInt(), b = input.nextInt();
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    sum += Math.pow(j, b);
                }
            }
            mod=sum%1000000007;
            System.out.println("Case "+i+": "+mod);
        }
    }
}