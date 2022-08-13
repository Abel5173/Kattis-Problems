import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> disteinct = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            disteinct.add(a % 42);
        }
        System.out.println(disteinct.size());
        sc.close();
    }
}
