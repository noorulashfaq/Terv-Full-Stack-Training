import java.util.Scanner;

public class T037_SumOddEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int oddSum = 0, evenSum = 0;
        System.out.println("\nEnter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i != 0) {
                if (i % 2 == 0) {
                    evenSum += arr[i];
                } else {
                    oddSum += arr[i];
                }
            }
        }
        System.out.println("Odd indices sum: " + oddSum);
        System.out.println("Even indices sum: " + evenSum);
        sc.close();
    }
}