import java.util.Scanner;

public class conundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0, i = 0;
        while (i < s.length()) {
            if (i % 3 == 0 && s.charAt(i) != 'P') {
                c++;
                i++;
                continue;
            } else if (i % 3 == 1 && s.charAt(i) != 'E') {
                c++;
                i++;
                continue;
            } else if (i % 3 == 2 && s.charAt(i) != 'R') {
                c++;
                i++;
                continue;
            } else
                i++;
        }
        System.out.println(c);
        sc.close();
    }
}
