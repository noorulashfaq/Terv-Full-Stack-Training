
// key = (sum of Largest digits of all the 3 numbers) - (sum of Smallest digit of all 3 numbers)

import java.util.Scanner;

public class T062_FindKey3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        int arr[] = new int[3];
        arr[0] = input1;
        arr[1] = input2;
        arr[2] = input3;

        int smallSum = 0, largeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i] % 10, max = arr[i] % 10;
            while (arr[i] > 0) {
                int rem = arr[i] % 10;
                if (rem > max) {
                    max = rem;
                }
                if (rem < min) {
                    min = rem;
                }
                arr[i] /= 10;
            }
            smallSum += min;
            largeSum += max;
        }

        System.out.println(largeSum - smallSum);
        sc.close();
    }
}

// // key = (sum of Largest digits of all the 3 numbers) - (sum of Smallest
// digit of all 3 numbers)

// import java.util.Scanner;

// public class T062_FindKey3 {

// public static int largest(int n) {
// int max = n % 10;
// while (n > 0) {
// int rem = n % 10;
// if (rem > max) {
// max = rem;
// }
// n /= 10;
// }
// return max;
// }

// public static int smallest(int n) {
// int min = n % 10;
// while (n > 0) {
// int rem = n % 10;
// if (rem < min) {
// min = rem;
// }
// n /= 10;
// }
// return min;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int input1 = sc.nextInt();
// int input2 = sc.nextInt();
// int input3 = sc.nextInt();
// int largestSum, smallestSum, key;

// int input1Large = largest(input1);
// int input2Large = largest(input2);
// int input3Large = largest(input3);

// largestSum = input1Large + input2Large + input3Large;

// int input1Small = smallest(input1);
// int input2Small = smallest(input2);
// int input3Small = smallest(input3);

// smallestSum = input1Small + input2Small + input3Small;

// key = largestSum - smallestSum;

// System.out.println(key);
// }
// }
