import java.util.*;
class Chocolate
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n*m%2==0) 
            System.out.println("Yes");
		else 
            System.out.println("No");
	}
}