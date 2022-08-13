import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class abc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String str = sc.next();
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);

        Map<Integer, Character> map = new HashMap<>();
map.put(A, a);
map.put(B, b);
map.put(C, c);
// //Creating a list of the original hashmap in order to sort
// 	//the elements with sort() method
// 	List<Map.Entry<Integer, Character>> list = new ArrayList<>(map.entrySet());
//     list.sort(Map.Entry.comparingByValue());
//     list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
    }
}