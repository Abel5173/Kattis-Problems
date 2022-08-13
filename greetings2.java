import java.util.Scanner;

public class greetings2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = 0;
    
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e') count++;
        }
        char e = 'e';
        System.out.print("h");
        for (int i = 0; i < (count*2); i++) {
            System.out.print(e);
        }
        System.out.print("y");
    }
}
