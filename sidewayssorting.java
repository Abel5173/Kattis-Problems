import java.util.Scanner;

public class sidewayssorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 100;
        while (N > 0) {
            int r = sc.nextInt(), c = sc.nextInt();
            if (r != 0 && c != 0) {
                for (int i = 0; i < r; i++) {
                    char[] arr = new char[c];
                    arr = sc.next().toCharArray();
                    char temp = 0;
                    int j = 0;
                    for (int k = 0; k < arr.length; k++) {
                        for (j = 0; j < arr.length; j++) {
                            if (Character.isUpperCase(arr[k])) {
                                if (arr[j] > Character.toLowerCase(arr[k])) {
                                    temp = arr[k];
                                    arr[k] = arr[j];
                                    arr[j] = temp;
                                }
                            } else {
                                if (arr[j] > arr[k]) {
                                    temp = arr[k];
                                    arr[k] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }
                    }
                    sorting(arr);
                }
            } else
                break;
            System.out.println();
            N--;
        }
    }

    public static void sorting(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
