import java.util.Scanner;

public class T013_Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0, rem, sum = 0;
        while(temp>0){
            count++;
            temp /= 10;
        }
        temp = num;
        while(temp>0){
            rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
}