import java.util.Scanner;

public class T057_PalindromeStr {

    public static boolean isPalindrome(String str) {
        String temp = str;
        String rev = new StringBuilder(temp).reverse().toString();
        return rev.equals(str);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (isPalindrome(s.toLowerCase()))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
        sc.close();
    }
}