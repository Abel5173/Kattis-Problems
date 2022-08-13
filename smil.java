import java.util.Scanner;

public class smil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        while (i <= str.length()) {
            if (str.indexOf(":)", i) == i) {
                System.out.println(i);
                i += 2;
            } else if (str.indexOf(";)", i) == i) {
                System.out.println(i);
                i += 2;
            } else if (str.indexOf(":-)", i) == i) {
                System.out.println(i);
                i += 3;
            } else if (str.indexOf(";-)", i) == i) {
                System.out.println(i);
                i += 3;
            } else
                i++;
        }
        sc.close();
    }
}