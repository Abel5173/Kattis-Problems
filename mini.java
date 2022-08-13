import java.util.Arrays;
import java.util.Scanner;

 class mini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        long min = 0;
        while ((a = input.nextInt()) != -1) {
            long[] arr1 = new long[a];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = input.nextLong();
            }
            Arrays.sort(arr1);
            min=arr1[1]-arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                long p =arr1[i] - arr1[i-1];
                if (min > p) {
                    min = p;
                }
            }
            System.out.println(min);
        }
    }
}
