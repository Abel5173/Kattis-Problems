import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        while(N>=1){
            double q = sc.nextDouble(); 
            double y = sc.nextDouble(); 
            sum += (q * y);
            N--;
        }
        System.out.printf("%.3f", sum);
    }
}