import java.util.Scanner;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() % 2 != 0)
            System.out.println("fix");
        else if (str.indexOf("()") == (str.length() / 2 - 1))
            System.out.println("correct");
        else
            System.out.println("fix");
        sc.close();
    }
}
