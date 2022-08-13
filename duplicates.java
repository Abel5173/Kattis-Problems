import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < sb.length(); i++) {
            if((i+1)<sb.length()){
            if(sb.charAt(i) == sb.charAt(i + 1)){
                sb.deleteCharAt(i);
                i = 0;
            }
        }
        }
        System.out.println(sb);
    }
}
