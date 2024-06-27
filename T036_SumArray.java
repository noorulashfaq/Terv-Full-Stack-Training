import java.util.Scanner;

public class T036_SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("\nEnter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum: " + sum);
        sc.close();
    }
}