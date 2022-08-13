import java.util.Scanner;

public class thebackslashproblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			int x = scan.nextInt();
			int n = 0;
			String slashes = "";
			scan.nextLine();
			if (x >= 1)
				n = (int) Math.pow(2, x);
			for (int i = 0; i < n - 1; i++)
				slashes += "\\";
			String str = scan.nextLine();
			String b = "";
			for (int i = 0; i < str.length(); i++) {
				char d = str.charAt(i);
				if ((d >= '!' && d <= '*') || (d >= '[' && d <= ']'))
					b += slashes;
				b += str.charAt(i);
			}
			System.out.println(b);
		}
	}

}