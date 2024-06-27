import java.util.Scanner;
public class T007_PrintTables{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplier: ");
        int a = sc.nextInt();
        System.out.print("Enter range: ");
        int b = sc.nextInt();
        
        for(int i = 1; i <= b; i++){
            System.out.println(i + " x " + a + " = " + i*a);
        }
        // int i = 1;
        // while(i<=b){
        //     System.out.println(i + " x " + a + " = " + i*a);
        //     i++;
        // }
        sc.close();
    }
}