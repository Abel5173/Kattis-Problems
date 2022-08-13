import java.util.Scanner;

public class simonsays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        while (N > 0) {
            String str = sc.nextLine();
            if (str.indexOf("Simon says") == 0) {
                System.out.println(str.substring(11));
            }
            N--;
        }
        sc.close();
    }
}