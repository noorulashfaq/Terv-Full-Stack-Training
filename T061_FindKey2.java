
// key = (Hundreds digit of input1 x Tens digit of input2) - (Largest digit of input3)

import java.util.Scanner;

public class T061_FindKey2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input1Hundreds, input2Tens, input3Largest, key;

        input1Hundreds = (input1 / 100) % 10;
        input2Tens = (input2 / 10) % 10;

        input3Largest = input3 % 10;
        while (input3 > 0) {
            int rem = input3 % 10;
            if (rem > input3Largest) {
                input3Largest = rem;
            }
            input3 /= 10;
        }

        key = (input1Hundreds * input2Tens) - input3Largest;

        System.out.println(key);
        sc.close();
    }
}
