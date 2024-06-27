import java.util.Scanner;
public class T044_ConcatenateArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.print("Enter size of array 2: ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        int arr3[] = new int[size1+size2];
        System.out.println("\nEnter array 1 elements: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
            arr3[i] = arr1[i];
        }
        System.out.println("\nEnter array 2 elements: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.print("\nNew array after concatenation: ");
        for(int i = 0; i < arr1.length+arr2.length; i++){
            System.out.print(arr3[i] + " ");
        }
        sc.close();
    }
}