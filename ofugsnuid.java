import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}
