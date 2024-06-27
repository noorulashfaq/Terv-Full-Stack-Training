import java.util.Scanner;
public class T002_ArithmeticOps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = (float) a / b;
        float g = a % b;
        System.out.println("Sum: " + c);
        System.out.println("Difference: " + d);
        System.out.println("Product: " + e);
        System.out.println("Quotient: " + f);
        System.out.println("Remainder: " + g);
        sc.close();
    }
}