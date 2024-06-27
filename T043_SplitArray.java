import java.util.Scanner;
public class T043_SplitArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("\nEnter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter index where you want to split: ");
        int s = sc.nextInt();
        System.out.print("Array 1: ");
        for(int i = 0; i < s; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nArray 2: ");
        for(int i = s; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}