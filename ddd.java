
import java.util.Scanner;

class ddd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T =  input.nextInt();
      for(int i=1; i<=T;i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            long d = input.nextLong();
            long c = gcd(a, b);
          if(d%c==0){
            System.out.println("Case "+i+": Yes");
          }else{
            System.out.println("Case "+i+": No");
          }
         
        }
    }
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}