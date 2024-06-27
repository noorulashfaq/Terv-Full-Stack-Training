import java.util.Scanner;
public class T000_PatternA
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
	int x = n;
	for (int i = 0; i < n; i++)
	  {
		for (int j = 0; j < n; j++)
		  {
			if ((i>n/2 && i==j) || (j==x) && (j<=n/2) || ((i==n-2) && (j!=0 && j!=1 && j!=2 && j!=n-3 && j!=n-2 && j!=n-1))){
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
