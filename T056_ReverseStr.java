import java.util.Scanner;

public class T056_ReverseStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuffer sb = new StringBuffer(s);
        sb.reverse().toString();

        System.out.println("The reverse is " + sb);
        sc.close();
    }
}
