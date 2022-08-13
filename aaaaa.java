import java.util.Scanner;

class aaaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a;
        while ((a = input.nextLong()) != -1) {
            long b = input.nextLong();
            long c = input.nextLong();
            long d=a%c;
            long e=b%c;
            System.out.println((d*e)%c);
        }
    }
   }