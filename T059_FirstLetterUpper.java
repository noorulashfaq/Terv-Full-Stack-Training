import java.util.Scanner;

public class T059_FirstLetterUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String arr[] = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ");
        }
        sc.close();
    }
}
