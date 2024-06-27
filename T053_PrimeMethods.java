import java.util.Scanner;

public class T053_PrimeMethods {

    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n <= 1) {
            flag = false;
            return flag;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isPrime(num))
            System.out.println("Prime");
        else
            System.out.println("Not prime");
        sc.close();
    }
}
