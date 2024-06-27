import java.util.Scanner;

public class T010_PhoneDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        long rem;
        int count = 0;
        long mobile = sc.nextLong();
        while(mobile>0){
            rem = (long) mobile % 10;
            if(rem!=0){
                count++;
            }
            mobile = mobile / 10;
        }
        System.out.println("Your mobile number has: " + count);
        sc.close();
    }
}