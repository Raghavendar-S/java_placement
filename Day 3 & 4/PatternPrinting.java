import java.util.*;

class PatternPrinting
{
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=10,c=170;
        int x=n,q=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("#  ");
            }
            for(int k=0;k<x;k++)
            {
                System.out.print(count+" ");
                count+=10;
            }
            x--;
            System.out.println("");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(j==n-i-1)
                {
                    System.out.print(c/10+" ");
                }
                else
                {
                    System.out.print(c+" ");
                }
                c+=10;
            }
            c-=(n*5*q)+10;
            q--;
            System.out.println("");
        }
    }
}
