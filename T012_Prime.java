import java.util.Scanner;

public class T012_Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int flag = 1;
        if(num<=1){
            flag = 0;
        }else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    flag = 0;
                }
            }
        }
        
        if(flag == 1){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}