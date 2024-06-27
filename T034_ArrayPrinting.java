import java.util.Scanner;
public class T034_ArrayPrinting{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("\nEnter array elements:");
        for(int  i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nYour array values:");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Arr[" + i + "]: " + arr[i]);
        }
        sc.close();
    }
}