import java.util.Scanner;
public class T021_RevNumSqrPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = sc.nextInt();
        int sqr = s*s;
        for(int i = 0; i < s; i++){
            for(int j = 0; j < s; j++){
                System.out.print(sqr-- + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}