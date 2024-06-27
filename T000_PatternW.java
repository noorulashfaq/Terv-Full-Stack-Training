import java.util.Scanner;
public class T000_PatternW
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
	int x = n-1;
	for (int i = 0; i < n; i++)
	  {
		for (int j = 0; j < n; j++)
		  {
			if ((i==j && i>n/2) || (j==x && j<=n/2) || j==0 || j==n-1){
			    System.out.print("* ");
			}else{
			    System.out.print("  ");
			}
		  }
		  x--;
		System.out.println ();

		sc.close();
	  }
  }
}
