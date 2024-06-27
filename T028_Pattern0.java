import java.util.Scanner;

public class T028_Pattern0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == x) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			x--;
			System.out.println();
		}
		sc.close();
	}
}
