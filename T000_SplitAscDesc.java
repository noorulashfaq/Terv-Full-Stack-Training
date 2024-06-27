import java.util.Scanner;
public class T000_SplitAscDesc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("\nEnter array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < (size/2)-1; i++){
            int min = i;
            for(int j = i+1; j < size/2; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        for(int i = size/2; i < size; i++){
            int max = i;
            for(int j = i+1; j < size; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp1 = arr[i];
            arr[i] = arr[max];
            arr[max] = temp1;
        }
        System.out.print("\nFirst half in asc and next half in desc: ");
        for(int i = 0; i < size/2; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = size/2; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}