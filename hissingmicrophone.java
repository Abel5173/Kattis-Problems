import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean hiss = true;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 's' && str.charAt(i+1) == 's'){
            System.out.println("hiss");
            hiss = false;
            break;
            }
        }
        if(hiss) System.out.println("no hiss");
    }
}
