import java.util.Scanner;
public class T016_HorizontalPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            System.out.print("# ");
        }
        sc.close();
    }
}