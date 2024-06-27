package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // bubble sort algorithm
        // for(int i = 0; i < size-1; i++){
        // for(int j = 0; )
        // }
        sc.close();
    }
}
