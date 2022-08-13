import java.util.Scanner;

public class nastyhackas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int a, b, c;
        for (int i = 0; i < d; i++) {
             a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
            if((b - c) > a){
            System.out.println("advertise");}
            else if((b - c) == a){
            System.out.println("does not matter");}
            else{
            System.out.println("do not advertise");}
        }
    }
}
