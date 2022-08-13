import java.util.Scanner;

public class nodup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split("\\s+");
        boolean t = true;
        for (int i = 0; i < s.length; i++) {
            int cnt = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals(s[i]) && i != j) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                t = false;
                break;
            }
        }
        if (t)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
