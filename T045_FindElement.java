import java.util.Scanner;
public class T045_FindElement{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("\nEnter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.print("\nElement " + key + " is found at the index " + i);
            }
        }
        sc.close();
    }
}