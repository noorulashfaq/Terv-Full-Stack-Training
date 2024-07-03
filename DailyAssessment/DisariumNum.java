import java.util.Scanner;

public class DisariumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, count = 0, sum = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            sum += Math.pow(temp % 10, count--);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}