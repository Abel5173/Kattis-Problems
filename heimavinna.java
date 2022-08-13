import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long cnt = 0;
        int i = 0;
        while (i <= str.length()) {
            if (str.charAt((i + 1) % str.length()) == '-') {
                String a = String.valueOf(str.charAt(i));
                String b = String.valueOf(str.charAt(i + 2));
                cnt += ((Integer.parseInt(b) - Integer.parseInt(a))) + 1;
                i += 4;
            } else if (str.charAt(i) != ';') {
                cnt++;
                i += 2;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
