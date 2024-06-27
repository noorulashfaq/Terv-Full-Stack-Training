import java.util.Scanner;

public class T040_ArrayPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("\nEnter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int flag = 1;
			if (arr[i] <= 1) {
				flag = 0;
			} else {
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				System.out.print("\nPrime numbers are: " + arr[i] + " ");
			}
		}
		sc.close();
	}
}
