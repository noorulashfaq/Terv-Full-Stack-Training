import java.util.Scanner;

public class T009_SumOddOrEven{
    public static void main (String[] args) {
        int rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        while(a>0){
            rem = a % 10;
            sum += rem;
            a = a / 10;
        }
        System.out.println("The sum of the digits is " + sum);
        if(sum % 2 == 0){
            System.out.println("The sum is even");
        }else{
            System.out.println("The sum is odd");
        }
        sc.close();
    }
}