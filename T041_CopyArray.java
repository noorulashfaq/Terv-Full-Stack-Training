import java.util.Scanner;

public class T041_CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int arrCopy[] = new int[size];
		System.out.println("\nEnter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arrCopy[i] = arr[i];
		}
		System.out.print("arrCopy: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrCopy[i] + " ");
		}
		sc.close();
	}
}
