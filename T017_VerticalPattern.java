import java.util.Scanner;
public class T017_VerticalPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            System.out.println("#");
        }
        sc.close();
    }
}