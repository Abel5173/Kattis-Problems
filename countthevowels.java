import java.util.Scanner;

public class countthevowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'a') cnt++;
            else if(str.charAt(i) == 'E' || str.charAt(i) == 'e') cnt++;
            else if(str.charAt(i) == 'I' || str.charAt(i) == 'i') cnt++;
            else if(str.charAt(i) == 'O' || str.charAt(i) == 'o') cnt++;
            else if(str.charAt(i) == 'U' || str.charAt(i) == 'u') cnt++;
        }
        System.out.println(cnt);
    }
}
