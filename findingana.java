import java.util.Scanner;

public class findingana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println(str.substring(i));
                break;
            }
        }
    }
}
