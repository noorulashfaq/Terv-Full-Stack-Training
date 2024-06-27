import java.util.Scanner;

public class T058_PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create a password: ");
        String password = sc.nextLine();

        String[] spaceArr = password.split(" ");
        if (password.length() > 8) {
            System.out.println("Character limit exceeded");
        } else {
            if (spaceArr.length != 1) {
                System.out.println("Space is not allowed to use");
            } else {
                int upr = 0, lwr = 0, num = 0, sym = 0;
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                        upr++;
                    } else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                        lwr++;
                    } else if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                        num++;
                    } else {
                        sym++;
                    }
                }
                if (upr >= 1 && lwr >= 3 && num >= 1 && sym >= 1) {
                    System.out.println("Valid password");
                } else {
                    System.out.println(
                            "Pattern not accepted.\nYou must use atleast 1 uppercase letter, 3 lowercase letter, 1 number and 1 symbol.\nTry again");
                }
            }
        }
        sc.close();
    }
}
