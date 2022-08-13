import java.util.Scanner;

public class headguard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            int i = 0, cnt = 1;
            while (i < str.length()) {
                if ((i + 1) == str.length()) {
                    System.out.print(cnt + "" + str.charAt(i));
                    i++;
                } else if (str.charAt(i) == str.charAt((i + 1) % str.length())) {
                    cnt++;
                    i++;
                } else {
                    System.out.print(cnt + "" + str.charAt(i));
                    cnt = 1;
                    i++;
                }
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}
