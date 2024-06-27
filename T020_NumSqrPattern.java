import java.util.Scanner;
public class T020_NumSqrPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = sc.nextInt();
        int count = 0;
        for(int i = 0; i < s; i++){
            for(int j = 0; j < s; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}