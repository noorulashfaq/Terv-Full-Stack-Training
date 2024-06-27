import java.util.Scanner;

public class T008_PrintPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a);
            }
            if(i!=a){
                System.out.print(" + ");
            }
        }
        sc.close();
    }
}