import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int str = s.nextInt();
        int cnt = 0;
        for (int i = 0; i < str; i++) {
            int a = s.nextInt();
            if(a<0) cnt++;
        }
        System.out.println(cnt);
    }
}
