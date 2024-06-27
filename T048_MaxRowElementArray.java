import java.util.Scanner;

public class T048_MaxRowElementArray {
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

        System.out.print("Max element of each row: ");
        for (int i = 0; i < r; i++) {
            int max = arr[i][0];
            for (int j = 0; j < c; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
        sc.close();
    }
}