import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0,N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int a = s.nextInt();
            if(i == 0)
            sum += a;
            else
            sum += (a - 1);
        }
        System.out.println(sum);
    }
}
