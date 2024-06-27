import java.util.Scanner;

public class T052_MultiplyArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array 1:");

        System.out.print("Enter rows: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns: ");
        int c1 = sc.nextInt();

        System.out.println("Array 2:");

        System.out.print("Enter rows: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Cannot do array multiplication");
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];

        System.out.println("\nEnter array 1 elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter array 2 elements: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[r1][c2];
        System.out.println("Product of two matrices: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}