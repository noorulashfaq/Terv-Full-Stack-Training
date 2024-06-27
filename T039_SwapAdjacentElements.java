import java.util.Scanner;
public class T039_SwapAdjacentElements{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int temp;
        System.out.println("\nEnter array elements:");
        for(int  i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i+=2){
            if(i+1 < arr.length){
                temp = arr[i];
                arr[i]  = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}