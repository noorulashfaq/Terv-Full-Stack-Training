import java.util.Scanner;

public class OccurrencesOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        int[] arr = new int[count];
        int i = 0;

        while (temp > 0) {
            arr[i++] = (int) temp % 10;
            temp /= 10;
        }

        int[] freq = new int[10];

        for (int j = 0; j < arr.length; j++) {
            freq[arr[j]]++;
        }

        System.out.println("The occurrences of the numbers: ");

        for (int k = 0; k < freq.length; k++) {
            System.out.println(k + " : " + freq[k]);
        }

        sc.close();

    }
}
