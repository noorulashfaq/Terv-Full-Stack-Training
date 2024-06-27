import java.util.Scanner;
public class T047_RowColSumArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("\nEnter array elements: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Sum of rows: ");
        for(int i = 0; i < r; i++){
            int rowSum = 0;
            for(int j = 0; j < c; j++){
                rowSum += arr[i][j];
            }
            System.out.print(rowSum + " ");
        }
        
        System.out.print("Sum of columns: ");
        for(int i = 0; i < c; i++){
            int colSum = 0;
            for(int j = 0; j < r; j++){
                colSum += arr[j][i];
            }
            System.out.print(colSum + " ");
        }
        sc.close();
    }
}