import java.util.Scanner;

public class T051_SumArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        if (r != c) {
            System.out.println("Rows and columns should be equal.");
            System.exit(0);
        }

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];

        System.out.println("\nEnter array 1 elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter array 2 elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSum of array elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}