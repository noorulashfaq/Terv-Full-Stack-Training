
// key = (Thousands digit of input1 x Hundreds digit of input2) + (smallest digit of input3)

import java.util.Scanner;

public class T060_FindKey1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input1Thousands, input2Hundreds, input3Smallest, key;

        input1Thousands = input1 / 1000;

        input2Hundreds = (input2 / 100) % 10;

        input3Smallest = input3 % 10;
        while (input3 > 0) {
            int rem = input3 % 10;
            if (rem < input3Smallest) {
                input3Smallest = rem;
            }
            input3 /= 10;
        }

        key = (input1Thousands * input2Hundreds) + input3Smallest;

        System.out.println(key);
        sc.close();
    }
}