import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String b = n.toString();
        String str = b.substring(0, 3);
        if (str.equals("555"))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
