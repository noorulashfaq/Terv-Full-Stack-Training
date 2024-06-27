import java.util.Scanner;

public class T064_NthPrimeSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter which prime: ");
        int num = sc.nextInt();

        int n = 0, i = 2, prime = 0;
        while (n < num) {
            n++;
            boolean flag = true;
            if (i <= 1) {
                flag = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                prime = i;
            }
            i++;
        }

        for (int k : arr) {
            System.out.print(k + prime);
        }
        sc.close();
    }
}
