import java.util.Scanner;
public class T005_LargestOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b || b == c || a == c){
            System.out.println("Either two or more numbers are same");
        }else if(a > b && a > c){
            System.out.println(a + " is greater");
        }else if(b > c){
            System.out.println(b + " is greater");
        }else{
            System.out.println(c + " is greater");
        }
        sc.close();
    }
}