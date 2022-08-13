import java.util.Scanner;

public class shoppinglisteasy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), m = sc.nextInt();
		String[][] s = new String[l][m];

		for (int j = 0; j < l; j++) {
			for (int k = 0; k < m; k++) {
				s[j][k] = sc.nextLine();
			}
		}
		// 4 5

		int count = 0;
		for (int i = 0; i < m; i++) {
			String a = s[0][i];
			boolean t = false;
			for (int j = 1; j < l; j++) {
				for (int k = 0; k < m; k++) {
					if (a == s[j][k]) {
						t = true;
						break;
					} else {
						t = false;
					}
				}
			}
			if (t) {
				count++;
			}
		}
		System.out.println(count);
	}
}