import java.util.Scanner;

public class T014_Palindrome{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem, rev = 0, temp = num;
        while(temp>0){
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }
        if(rev == num){
            System.out.print(num + " is a palindrome");
        }else{
            System.out.print(num + " is not a palindrome");
        }
        sc.close();
    }
}