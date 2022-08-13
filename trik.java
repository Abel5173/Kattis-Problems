import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> s = new ArrayList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A')
                Collections.swap(s, 0, 1);
            else if (str.charAt(i) == 'B')
                Collections.swap(s, 1, 2);
            else if (str.charAt(i) == 'C')
                Collections.swap(s, 2, 0);
        }
        int a = s.indexOf("A");
        System.out.println((a + 5) % 4);
    }
}
