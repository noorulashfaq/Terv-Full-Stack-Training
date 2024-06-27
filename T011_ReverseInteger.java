import java.util.Scanner;

public class T011_ReverseInteger{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp, rev = 0;
        while(n>0){
            temp = n % 10;
            rev = (rev * 10) + temp;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}