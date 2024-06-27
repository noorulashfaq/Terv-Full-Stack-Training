import java.util.Scanner;

public class T006_SimpleCalculator{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        
        int sum, difference, product, remainder;
        float quotient;
        
        System.out.print("Enter your operator (+ - * / %): ");
        char ch = sc.next().charAt(0);
        
        switch(ch){
            case '+':
                sum = num1 + num2;
                System.out.println("The sum is " + sum);
                break;
            case '-':
                difference = num1 - num2;
                System.out.println("The difference is " + difference);
                break;
            case '*':
                product = num1 * num2;
                System.out.println("The product is " + product);
                break;
            case '/':
                quotient = (float) num1 / num2;
                System.out.println("The quotient is " + quotient);
                break;
            case '%':
                remainder = num1 % num2;
                System.out.println("The remainder is " + remainder);
                break;
            default:
                System.out.println("Please enter valid choice");
        }
        sc.close();
    }
}