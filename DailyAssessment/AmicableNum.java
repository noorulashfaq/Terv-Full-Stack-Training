import java.util.Scanner;

public class AmicableNum {
    public static int factorsSum(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(factorsSum(n1) == n2 && factorsSum(n2) == n1)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
