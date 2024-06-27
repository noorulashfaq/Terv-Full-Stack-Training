
// key = [largest digit in the thousands place of all three numbers][largest digit in the hundreds place of all three numbers][largest digit in the tens place of all three numbers][largest digit in the units place of all three numbers]

import java.util.Scanner;

public class T063_FindKey4 {

    public static int largest(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        int key[] = new int[4];

        int input1Thousands = input1 / 1000;
        int input2Thousands = input2 / 1000;
        int input3Thousands = input3 / 1000;

        key[0] = largest(input1Thousands, input2Thousands, input3Thousands);

        int input1Hundreds = (input1 / 100) % 10;
        int input2Hundreds = (input2 / 100) % 10;
        int input3Hundreds = (input3 / 100) % 10;

        key[1] = largest(input1Hundreds, input2Hundreds, input3Hundreds);

        int input1Tens = (input1 / 10) % 10;
        int input2Tens = (input2 / 10) % 10;
        int input3Tens = (input3 / 10) % 10;

        key[2] = largest(input1Tens, input2Tens, input3Tens);

        int input1Units = input1 % 10;
        int input2Units = input2 % 10;
        int input3Units = input3 % 10;

        key[3] = largest(input1Units, input2Units, input3Units);

        for (int i : key) {
            System.out.print(i);
        }
        sc.close();
    }
}
