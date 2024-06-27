import java.util.Scanner;

public class T049_DiagonalsSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("\nEnter array elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0, sum2 = 0;
        System.out.print("Sum of left to right diagonal: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }
        System.out.print(sum1 + " ");

        int x = 0;
        System.out.print("\nSum of right to left diagonal: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (j == x) {
                    sum2 += arr[i][j];
                }
            }
            x++;
        }
        System.out.print(sum2 + " ");
        sc.close();
    }
}