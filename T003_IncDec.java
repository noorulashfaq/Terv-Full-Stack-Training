import java.util.Scanner;

public class T003_IncDec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to do inc/dec: ");
        int a = sc.nextInt();
        System.out.println("Post Increment: " + a++);
        System.out.println("Pre Increment: " + ++a);
        System.out.println("Post Decrement: " + a--);
        System.out.println("Pre Decrement: " + --a);
        sc.close();
    }
}