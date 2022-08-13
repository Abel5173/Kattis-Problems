import java.util.*;
 public class ferload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int l = sc.nextInt() * 100; 
            int m = sc.nextInt(); 
            Queue<Integer> left = new LinkedList<>();
            Queue<Integer> right = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                int car = sc.nextInt();
                String side = sc.next();
                if (side.equals("left")) {
                    left.add(car);
                } else {
                    right.add(car);
                }
            }
            int side = 1; 
            int times = 0;
            while (!left.isEmpty() || !right.isEmpty()) {
                int totlen = l;
                if (side == 1) {
                    while (!left.isEmpty()) {
                        if (totlen - left.peek() >= 0) {
                            totlen -= left.poll();
                        } else {
                            break;
                        }
                    }
                    side = 0;
                } else if (side == 0) {
                    while (!right.isEmpty()) {
                        if (totlen - right.peek() >= 0) {
                            totlen -= right.poll();
                        } else {
                            break;
                        }
                    }
                    side = 1;
                }
                times++;
            }
            System.out.println(times);
        }
    }
}
