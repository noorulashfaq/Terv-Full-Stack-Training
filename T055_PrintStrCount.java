import java.util.Scanner;

// package Practice.055_PrintStrCount;

public class T055_PrintStrCount {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        int count = 0;

        System.out.print("You entered: ");
        for (int i = 0; i < s.length(); i++) {
            count++;
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("\nChar count: " + count);
        sc.close();
    }
}
