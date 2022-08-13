import java.util.Arrays;
import java.util.Scanner;

 class sort {
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
           for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
           }
           System.out.println();
        }
    }
}
