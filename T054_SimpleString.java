import java.util.Scanner;

public class T054_SimpleString {
    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println(s1);
        String s2 = new String("Noorul");
        System.out.println(s2);
        char[] ch = { 'A', 'S', 'H', 'F', 'A', 'Q' };
        String s3 = new String(ch);
        System.out.println(s3);
        Scanner sc = new Scanner(System.in);
        String s4 = sc.nextLine();
        System.out.println(s4);
        sc.close();
    }
}