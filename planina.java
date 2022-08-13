import java.util.Scanner;

public class planina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = (int)Math.pow(2, (n+1)) * ((int)Math.pow(2, (n-1)) + 1) + 1;
        System.out.println(b);
    }
}
